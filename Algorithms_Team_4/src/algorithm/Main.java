package algorithm;
import algorithm.AlgorithmManagement;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Big exercises chapter 2");
        jFrame.setBounds(250, 100, 450, 300);
        jFrame.setLayout(null);


        JPanel algorithm = AlgorithmManagement.algorithmPanel();


        JTabbedPane manage = new JTabbedPane();
        manage.setBounds(0,0,450,300);

        manage.add("Algorithms",algorithm);

        jFrame.add(manage);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

}