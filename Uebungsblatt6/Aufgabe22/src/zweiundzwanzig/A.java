package zweiundzwanzig;

import javax.swing.*;
import java.awt.*;

public class A extends JFrame {

    public A() {
        setTitle("Color Switcher");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton green = new JButton("Green");
        green.addActionListener(e -> panel.setBackground(Color.GREEN));

        JButton red = new JButton("Red");
        red.addActionListener(e -> panel.setBackground(Color.RED));

        panel.add(green);
        panel.add(red);

        add(panel, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new A();
    }
}
