package vierzig;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Memory extends JFrame {

    public static void main(String[] args) {
        new Memory();
    }


    public Memory() {
        super("Memory");
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLayout(new GridLayout(4, 5));

        for (int i = 1; i <= 20; i++) {
            this.add(new JButton(i + ""));
        }

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (JOptionPane.showConfirmDialog(null, "sicher?", "Schließen", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    System.exit(1);
                }
            }
        });

        this.pack();
        this.setVisible(true);
    }
}
