package algorithm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlgorithmManagement {

    public static JPanel algorithmPanel() {
        JPanel algorithmPanel = new JPanel();

        JLabel title = new JLabel("Process moderation algorithms");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBounds(5, 10, 450, 20);

        JButton fcfs = new JButton("FCFS Algorithm");
        fcfs.setBounds(100, 40, 250, 30);

        JButton rr = new JButton("RR Algorithm");
        rr.setBounds(100, 80, 250, 30);

        JButton sjr = new JButton("SJF Algorithm");
        sjr.setBounds(100, 120, 250, 30);

        JButton srt = new JButton("SRTN Algorithm");
        srt.setBounds(100, 160, 250, 30);

        fcfs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               FCFSAlgorithm fcfs = new FCFSAlgorithm();
                        fcfs.setVisible(true);
                        fcfs.setLayout(null);
            }
        });
        rr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RRAlgorithm rr = new RRAlgorithm();
                rr.setVisible(true);
                rr.setLayout(null);
            }
        });
        
        sjr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 SJFAlgorithm sjr = new SJFAlgorithm();
                        sjr.setVisible(true);
                        sjr.setLayout(null);
            }
        });
        srt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SRTNAlgorithm srtn = new SRTNAlgorithm();
                        srtn.setVisible(true);
                        srtn.setLayout(null);
            }
        });

        algorithmPanel.add(title);
        algorithmPanel.add(fcfs);
        algorithmPanel.add(rr);
        algorithmPanel.add(sjr);
        algorithmPanel.add(srt);
        algorithmPanel.setLayout(null);
        algorithmPanel.setBackground(Color.green);
        return algorithmPanel;
    }
}
