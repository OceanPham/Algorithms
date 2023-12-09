package algorithm;

import algorithm.FCFSAlgorithm;
import algorithm.SJFAlgorithm;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

class Process {
    int processId;
    int burstTime;
    int remainTime;
    int arrivalTime;
    int saveTime;
    int waitingTime;

    public Process(int processId, int arrivalTime, int burstTime) {
        this.processId = processId;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.remainTime = burstTime;
        this.saveTime = 0;
        this.waitingTime = 0;
    }

}

public class RRAlgorithm extends JFrame {
    private Queue<Process> processes;
    private DefaultTableModel tableModel;
    private JTextField processIdField,  burstTimeField, timeQuantumField, arrivalTimeField, saveTimeField;

    private JLabel avgTimeFile;

    public RRAlgorithm() {
        setTitle("Round Robin Algorithm Demo");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(700, 500);
        setLocationRelativeTo(null);

        processes = new LinkedList<>();
        tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Thời gian đến");
        tableModel.addColumn("Thời gian thực hiện");
        tableModel.addColumn("Thời gian lưu hệ thống");
        tableModel.addColumn("Thời gian chờ");

        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0, 50, 700, 300);

        processIdField = new JTextField(5);
        arrivalTimeField = new JTextField(5);
        burstTimeField = new JTextField(5);
        timeQuantumField = new JTextField(5);
        saveTimeField = new JTextField(5);

        JButton addButton = new JButton("Add Process");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addProcess();
            }
        });

        JButton runButton = new JButton("Run RR");
        runButton.setBounds(5, 400, 150, 40);
        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runRR();
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.setBounds(0, 0,700, 80);

        inputPanel.add(new JLabel("Process ID:"));
        inputPanel.add(processIdField);
        inputPanel.add(new JLabel("Thời gian đến:"));
        inputPanel.add(arrivalTimeField);
        inputPanel.add(new JLabel("Thời gian sử dụng:"));
        inputPanel.add(burstTimeField);
        inputPanel.add(new JLabel("Bước nhảy: "));
        inputPanel.add(timeQuantumField);
        inputPanel.add(addButton);

        JButton back = new JButton("Quay lại");
        back.setBounds(590, 400, 100, 40);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        avgTimeFile = new JLabel();
        avgTimeFile.setBounds(5, 350, 700, 40);

        JButton clear = new JButton("Clear");
        clear.setBounds(300, 400, 100, 40);

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(processes.isEmpty()){
                    JOptionPane.showMessageDialog(RRAlgorithm.this, "Hàng đợi tiến trình rỗng");
                }else{
                    tableModel.setRowCount(0);
                    processes.clear();
                    avgTimeFile.setText("");
                }
            }
        });
        add(clear);
        add(back);
        add(avgTimeFile);
        setLayout(null);
        add(scrollPane);
        add(inputPanel);
        add(runButton);
    }

    private void addProcess() {

        try {
            int processId = Integer.parseInt(processIdField.getText());
            int arrivalTime = Integer.parseInt(arrivalTimeField.getText());
            int burstTime = Integer.parseInt(burstTimeField.getText());
            int timeRemain = Integer.parseInt(timeQuantumField.getText());

            if(processId < 0 || arrivalTime < 0 || burstTime < 0 || timeRemain < 0){
                JOptionPane.showMessageDialog(this, "Dữ liệu không đúng vui lòng nhập lại");
            }else{
                Process process = new Process(processId, arrivalTime, burstTime); // Khởi tạo saveTime là 0

                processes.add(process);

                tableModel.addRow(new Object[]{
                        process.processId,
                        process.arrivalTime,
                        process.burstTime,
                        process.saveTime,
                        process.waitingTime
                });

                // Xóa dữ liệu nhập trong các trường
                processIdField.setText("");
                arrivalTimeField.setText("");
                burstTimeField.setText("");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Dữ liệu không hợp lệ. " +
                    "Vui lòng nhập lại.");
        }
    }

    private void runRR() {
        try {
            List<Process> processList = new ArrayList<>(processes);
            processList.sort(Comparator.comparingInt(process -> process.arrivalTime));
            int timeQuantum = Integer.parseInt(timeQuantumField.getText());
            int currentTime = 0;


            if (!processList.isEmpty()) {
                Queue<Process> queue = new LinkedList<Process>(processList);

                while (!queue.isEmpty()) {
                    Process currentProcess = queue.poll();

                    if (currentProcess.arrivalTime > currentTime) {
                        currentTime = currentProcess.arrivalTime;
                    }
                    System.out.println(currentTime);
                    if (currentProcess.remainTime <= timeQuantum) {
                        currentTime += currentProcess.remainTime;
                        currentProcess.remainTime = 0;
                        currentProcess.saveTime = currentTime - currentProcess.arrivalTime;
                        currentProcess.waitingTime = currentProcess.saveTime - currentProcess.burstTime;
                    } else {
                        currentTime += timeQuantum;
                        currentProcess.remainTime = currentProcess.remainTime - timeQuantum;
                        queue.offer(currentProcess);
                    }

                    // Check for other processes arriving during execution
                    for (Process process : processes) {
                        if (process.arrivalTime <= currentTime && !queue.contains(process) && process.remainTime > 0) {
                            queue.offer(process);
                        }
                    }
                }
                double averageWaitingTime = 0;
                double totalTurnaroundTime = 0;

                for (Process process : processes) {
                    averageWaitingTime += process.waitingTime;
                    totalTurnaroundTime += process.saveTime;
                    tableModel.setValueAt(process.saveTime, process.processId - 1, 3);
                    tableModel.setValueAt(process.waitingTime, process.processId - 1, 4);
                }
                averageWaitingTime /= processes.size();
                totalTurnaroundTime /= processes.size();
                avgTimeFile.setText("Thời gian chờ đợi trung bình: " + averageWaitingTime +
                        " | Thời gian lưu hệ thống trung bình: " + totalTurnaroundTime);
            } else {
                JOptionPane.showMessageDialog(this, "Hàng đợi tiến trình rỗng");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Dữ liệu không hợp lệ. Vui lòng nhập lại.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                RRAlgorithm demo = new RRAlgorithm();
                demo.setVisible(true);
            }
        });
    }
}
