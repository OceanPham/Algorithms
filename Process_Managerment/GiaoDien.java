/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demotientrinh;

import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class GiaoDien extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDien
     */
    public GiaoDien() {
        initComponents();
        setTitle("Process Management");
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Đa Tiến Trình");
        jButton1.setToolTipText("");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datientrinh(evt);
            }
        });

        jButton2.setText("Đơn Tiến Trình");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dontientrinh(evt);
            }
        });

        jButton4.setText("Thông Tin Tiến Trình");
        jButton4.setToolTipText("");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckTienTrinh(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setEnabled(false);
        jTextArea1.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTextArea1);

        jButton3.setText("Xóa");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Clear(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void datientrinh(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datientrinh
        try {
            // Tạo một ProcessBuilder để mở Task Manager
            ProcessBuilder taskManagerProcessBuilder = new ProcessBuilder("notepad.exe");
            Process taskManagerProcess = taskManagerProcessBuilder.start();
            jTextArea1.append("Notepad đã được khởi chạy.\n");

            // Tạo một ProcessBuilder để mở Control Panel
            ProcessBuilder controlPanelProcessBuilder = new ProcessBuilder("Control.exe");
            Process controlPanelProcess = controlPanelProcessBuilder.start();
            jTextArea1.append("Control Panel đã được khởi chạy.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_datientrinh

    private void dontientrinh(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dontientrinh
        try {
            ProcessBuilder fileExplorerProcessBuilder = new ProcessBuilder("explorer.exe");
            Process fileExplorerProcess = fileExplorerProcessBuilder.start();
            jTextArea1.append("Explorer đã được khởi chạy.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_dontientrinh

    private void CheckTienTrinh(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckTienTrinh
        String[] appNames = {"Control.exe", "explorer.exe", "notepad.exe"};

        int App = 0;
        for (String appName : appNames) {
            long BoNho = CheckBoNho(appName);
            jTextArea1.append(appName + " sử dụng " + BoNho + " MB bộ nhớ.\n");
            if (BoNho > 0) {
            App++;
            }
        }
        
        if (App > 1) {
            jTextArea1.append("Đa tiến trình\n");
        } else if (App == 1) {
            jTextArea1.append("Đơn tiến trình\n");
        } else {
            jTextArea1.append("Không có tiến trình nào đang thực thi.\n");
        }
    }

    private static long CheckBoNho(String processName) {
        long BoNho = 0;
        try {
            Process process = Runtime.getRuntime().exec("tasklist.exe /FI \"IMAGENAME eq " + processName + "\" /FO CSV /NH");
            InputStream inputStream = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length > 4) {
                    BoNho = parseMemoryUsage(tokens[4]);
                    break;
                }
            }

            reader.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return BoNho;
    }

    private static long parseMemoryUsage(String memoryUsageString) {
        long BoNho = 0;
        try {
            BoNho = Long.parseLong(memoryUsageString.trim().replaceAll("\"", ""));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return BoNho;
    }//GEN-LAST:event_CheckTienTrinh

    private void Clear(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Clear
        jTextArea1.setText("");
    }//GEN-LAST:event_Clear

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GiaoDien gui = new GiaoDien();
                gui.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
