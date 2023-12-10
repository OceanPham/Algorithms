package javaapplication1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Manager extends JFrame {
    static Manager th = new Manager();
    private static JTable table;
    private static DefaultTableModel tableModel;
    private boolean fileSaved = false;

    public Manager() {
        setTitle("DEMO PROGRAM OPERATING SYSTEMS");
        setSize(600, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JButton btndonLuong = new JButton("Đơn Luồng");
        btndonLuong.setBounds(30, 30, 100, 30);
        JButton btndaLuong = new JButton("Đa Luồng");
        btndaLuong.setBounds(30, 70, 100, 30);
        JButton btnSave = new JButton("Lưu file");
        btnSave.setBounds(30, 110, 100, 30);
        JButton btnshare = new JButton("Chia sẻ dữ liệu giữa các luồng");
        btnshare.setBounds(30, 150, 100, 30);
        JLabel lbc = new JLabel("Coppy right @2023 by Team4-63KTPM2");
        lbc.setBounds(180, 480, 300, 30);
        
        table = new JTable();
        JScrollPane jsp = new JScrollPane(table);

        jsp.setBounds(150, 30, 430, 450);

        add(btndonLuong);
        add(btndaLuong);
        add(btnSave);
        add(btnshare);
        add(jsp);
        add(lbc);

        btndonLuong.addActionListener((e) -> {
            tableModel.setRowCount(0);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            // Đổ dữ liệu vào bảng
            String output = "Nhóm 4 Number One!";
            tableModel.addRow(new Object[]{output});
        });

        btndaLuong.addActionListener(e -> {
            tableModel.setRowCount(0);
            Thread thread1 = new Thread(new WorkerThread());
            Thread thread2 = new Thread(new WorkerThread());
            thread1.start();
            thread2.start();

        });

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showSaveDialog(Manager.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    String filePath = fileChooser.getSelectedFile().getAbsolutePath();
                    int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to save file while don't erase old file?", "Save file", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        fileSaved = true;
                    } else {
                        fileSaved = false;
                    }

                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, fileSaved))) {
                        // Lấy số lượng hàng và cột trong bảng
                        int rowCount = tableModel.getRowCount();
                        int columnCount = tableModel.getColumnCount();

                        // Ghi dữ liệu từ bảng vào file
                        for (int row = 0; row < rowCount; row++) {
                            for (int col = 0; col < columnCount; col++) {
                                Object value = tableModel.getValueAt(row, col);
                                writer.write(value.toString());
                                writer.write("\t");
                            }
                            writer.newLine();
                        }

                        JOptionPane.showMessageDialog(rootPane, "Dữ liệu đã được lưu vào file: " + filePath);

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        btnshare.addActionListener((e) -> {
            tableModel.setRowCount(0);
            DataContainer dataContainer = new DataContainer();
            //Thai example = new Thai();

            //example.setVisible(true);
            // Tạo và khởi chạy hai luồng
            Thread thread1 = new Thread(new DataProducer(dataContainer, th));
            Thread thread2 = new Thread(new DataConsumer(dataContainer, th));
            thread1.start();
            thread2.start();
        });

        // Khởi tạo mô hình bảng
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Đầu ra");

        // Gán mô hình bảng cho bảng
        table.setModel(tableModel);
    }

    public static void main(String[] args) {
        Manager th = new Manager();
        th.setVisible(true);
    }

    static class WorkerThread implements Runnable {

        private static final int NUM_EXECUTIONS = 4;

        @Override
        public void run() {
            for (int i = 0; i < NUM_EXECUTIONS; i++) {
                try {
                    // Ngừng một khoảng thời gian ngẫu nhiên
                    Thread.sleep((long) (Math.random() * 5000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Thread currentThread = Thread.currentThread();
                String ID = ("Thread ID: " + currentThread.getId());
                String name = ("Thread Name: " + currentThread.getName());
                String currentThread_ = ("Thread Priority: " + currentThread.getPriority());

                tableModel.addRow(new Object[]{name});
                tableModel.addRow(new Object[]{currentThread_});
                tableModel.addRow(new Object[]{ID});
            }
        }
    }

    static class DataContainer {

        private Manager example;

        public DataContainer(Manager example) {
            this.example = example;
        }
        private int data;
        private List<String> notes;

        public DataContainer() {
            notes = new ArrayList<>();
        }

        public synchronized void setData(int newData) {
            System.out.println("Setting data: " + newData);
            data = newData;
            notes.add("Setting data: " + newData);
            String note = "Setting data: " + newData;
            tableModel.addRow(new Object[]{note});

            notify(); // Thông báo cho các luồng đang chờ rằng dữ liệu đã sẵn có
        }

        public synchronized int getData() throws InterruptedException {
            while (data == 0) {
                wait(); // Chờ cho đến khi dữ liệu sẵn có
            }
            int value = data;
            data = 0; // Đặt lại dữ liệu về 0
            String note = "Consuming data: " + value;
            tableModel.addRow(new Object[]{note});
            System.out.println("Consuming data: " + value);
            return value;
        }
    }

    static class DataProducer implements Runnable {

        private final DataContainer dataContainer;
        private final Manager example;

        public DataProducer(DataContainer dataContainer, Manager example) {
            this.dataContainer = dataContainer;
            this.example = example;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(1000); // Giả lập thời gian xử lý
                    dataContainer.setData(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class DataConsumer implements Runnable {

        private final DataContainer dataContainer;
        private final Manager example;

        public DataConsumer(DataContainer dataContainer, Manager example) {
            this.dataContainer = dataContainer;
            this.example = example;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(2000); // Giả lập thời gian xử lý
                    int data = dataContainer.getData();
                    
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
