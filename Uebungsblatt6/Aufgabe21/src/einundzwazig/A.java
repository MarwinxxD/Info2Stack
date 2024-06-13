package einundzwazig;

import javax.swing.*;
import java.awt.*;

public class A extends JFrame {

    public A() {
        setTitle("My First Java Frame");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(400, 100);

        add(new JTextField("Text..."), BorderLayout.CENTER);
        add(new JButton("RIGHT"), BorderLayout.EAST);
        add(new JButton("LEFT"), BorderLayout.WEST);

        JTextField field = new JTextField("SOUTH");
        field.setEditable(false);
        field.setHorizontalAlignment(JTextField.CENTER);

        add(new JPanel(new FlowLayout()).add(field), BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new A();
    }
}
