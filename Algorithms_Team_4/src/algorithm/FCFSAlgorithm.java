package algorithm;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
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
        this.saveTime = 0;
        this.waitingTime = 0;
        this.completionTime = 0;
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

public class FCFSAlgorithm extends JFrame {
    private List<Process> processes;
    private DefaultTableModel tableModel;

    private int carryTime = 0;
    private JTextField processIdField, arrivalTimeField, burstTimeField, saveTimeField;
    private JLabel avgTimeFile;

    public FCFSAlgorithm() {
        setTitle("FCFS Algorithm Demo");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(700, 500);
        setLocationRelativeTo(null);

        processes = new ArrayList<>();
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

        JButton addButton = new JButton("Thêm tiến trình");
        addButton.setSize(150, 30);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addProcess();
            }
        });

        JButton runButton = new JButton("Run FCFS");
        runButton.setBounds(5, 400, 150, 40);
        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runFCFS();
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
        avgTimeFile.setBounds(5, 300, 700, 40);

        JButton clear = new JButton("Clear");
        clear.setBounds(300, 400, 100, 40);

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(processes.isEmpty()){
                    JOptionPane.showMessageDialog(FCFSAlgorithm.this, "Hàng đợi tiến trình rỗng");
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
            if(processId < 0 || arrivalTime < 0 || burstTime < 0){
                JOptionPane.showMessageDialog(this, "Dữ liệu không đúng vui lòng nhập lại");
            }else{
                Process process = new Process(processId, arrivalTime, burstTime);
                processes.add(process);

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

    private void runFCFS() {
        if(processes.isEmpty()){
            JOptionPane.showMessageDialog(this, "Hàng đợi tiến trình rỗng");

        }else{
            Collections.sort(processes, Comparator.comparingInt(p -> p.arrivalTime));

            int currentTime = 0;
            int sumSave = 0;
            int sumWaiting = 0;

            for (Process process : processes) {
                if (currentTime < process.arrivalTime) {
                    currentTime = process.arrivalTime;
                }

                process.completionTime = currentTime + process.burstTime;
                process.saveTime = process.completionTime - process.arrivalTime;
                process.waitingTime = process.saveTime - process.burstTime;

                sumSave += process.saveTime;
                sumWaiting += process.waitingTime;

                currentTime = process.completionTime;
                tableModel.setValueAt(process.saveTime, process.processId - 1, 3);
                tableModel.setValueAt(process.waitingTime, process.processId - 1, 4);
            }
            float avgSave = (float) sumSave / (processes.size());
            float avgWait = (float) sumWaiting / (processes.size());

            avgTimeFile.setText("Thời gian chờ đợi trung bình: " + avgWait +
                    " | Thời gian lưu hệ thống trung bình: " + avgSave);
        }
    }

//    public static void main(String[] args) {
//        FCFSAlgorithm demo = new FCFSAlgorithm();
//        demo.setVisible(true);
//        demo.setLayout(null);
//    }
}

