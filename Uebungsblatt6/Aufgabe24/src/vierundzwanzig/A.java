package vierundzwanzig;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.event.MouseEvent;

public class A extends JFrame {

    public A() {
        setTitle("Rechteck");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(500, 500);

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JLabel rectangle = new JLabel("Rechteck");
        rectangle.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                rectangle.setLocation(e.getX(), e.getY());
                add(rectangle);
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                rectangle.setSize(e.getX(), e.getY());
                add(rectangle);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new A();
    }
}
