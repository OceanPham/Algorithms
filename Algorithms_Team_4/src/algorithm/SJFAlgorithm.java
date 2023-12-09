package algorithm;

import algorithm.FCFSAlgorithm;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Process {
    int processId;
    int arrivalTime;
    int burstTime;
    int completionTime;
    int saveTime;
    int waitingTime;

    public Process(int processId, int arrivalTime, int burstTime) {
        this.processId = processId;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.completionTime = 0;
        this.saveTime = 0;
        this.waitingTime = 0;
    }

    @Override
    public String toString() {
        return "Process{" +
                "processId=" + processId +
                ", arrivalTime=" + arrivalTime +
                ", burstTime=" + burstTime +
                ", saveTime=" + saveTime +
                ", waitingTime=" + waitingTime +
                '}';
    }
}

public class SJFAlgorithm extends JFrame {
    private List<Process> processList;
    private DefaultTableModel tableModel;
    private JTextField processIdField, burstTimeField, arrivalTimeField, saveTimeField;

    private JLabel avgTimeFile;

    public SJFAlgorithm() {
        setTitle("Shortest Job First Algorithm Demo");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(700, 500);
        setLocationRelativeTo(null);

        processList = new ArrayList<>();
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
        saveTimeField = new JTextField(5);

        JButton addButton = new JButton("Add Process");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addProcess();
            }
        });

        JButton runButton = new JButton("Run SJF");
        runButton.setBounds(5, 400, 150, 40);
        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runSJF();
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.setBounds(0, 0,700, 80);
        inputPanel.add(new JLabel("ID:"));
        inputPanel.add(processIdField);
        inputPanel.add(new JLabel("Thời gian đến:"));
        inputPanel.add(arrivalTimeField);
        inputPanel.add(new JLabel("Thời gian thực hiện:"));
        inputPanel.add(burstTimeField);
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
                if(processList.isEmpty()){
                    JOptionPane.showMessageDialog(SJFAlgorithm.this, "Hàng đợi tiến trình rỗng");
                }else{
                    tableModel.setRowCount(0);
                    processList.clear();
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

            if(processId < 0 || arrivalTime < 0 || burstTime < 0){
                JOptionPane.showMessageDialog(this, "Dữ liệu không đúng vui lòng nhập lại");
            }else{
                Process process = new Process(processId, arrivalTime, burstTime); // Khởi tạo saveTime là 0
                processList.add(process);
                tableModel.addRow(new Object[]{
                        process.processId,
                        process.arrivalTime,
                        process.burstTime,
                        process.saveTime,
                        process.waitingTime
                });
                processIdField.setText("");
                arrivalTimeField.setText("");
                burstTimeField.setText("");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Dữ liệu không đúng vui lòng nhập lại");
        }
    }

    private void runSJF() {
        if(processList.isEmpty()){
            JOptionPane.showMessageDialog(SJFAlgorithm.this, "Hàng đợi tiến trình rỗng");
        }else{
            double totalWaitingTime = 0;
            double totalTurnaroundTime = 0;


            int currentTime = 0;
            int n = processList.size();
            int completed = 0;

            while (completed < n) {
                int shortestIndex = -1;
                int shortestBurst = Integer.MAX_VALUE;

                for (int i = 0; i < n; i++) {
                    Process currentProcess = processList.get(i);
                    if (currentProcess.arrivalTime <= currentTime &&
                            currentProcess.burstTime < shortestBurst) {
                        shortestIndex = i;
                        shortestBurst = currentProcess.burstTime;
                    }
                }

                if (shortestIndex == -1) {
                    currentTime++;
                } else {
                    Process shortestProcess = processList.get(shortestIndex);
                    shortestProcess.completionTime = currentTime + shortestProcess.burstTime;
                    currentTime += shortestProcess.burstTime;
                    shortestProcess.saveTime = shortestProcess.completionTime - shortestProcess.arrivalTime;
                    shortestProcess.waitingTime = shortestProcess.saveTime - shortestProcess.burstTime;
                    shortestProcess.burstTime = 0;
                    completed++;
                }
            }

            for (Process process : processList) {
                totalTurnaroundTime += process.saveTime;
                totalWaitingTime += process.waitingTime;
                tableModel.setValueAt(process.saveTime, process.processId - 1, 3);
                tableModel.setValueAt(process.waitingTime, process.processId - 1, 4);

            }

            double averageWaitingTime = totalWaitingTime / (processList.size());
            double averageTurnaroundTime = totalTurnaroundTime / (processList.size());

            avgTimeFile.setText("Thời gian chờ đợi trung bình: " + averageWaitingTime +
                    " | Thời gian lưu hệ thống trung bình: " + averageTurnaroundTime);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SJFAlgorithm demo = new SJFAlgorithm();
                demo.setVisible(true);
            }
        });
    }
}
