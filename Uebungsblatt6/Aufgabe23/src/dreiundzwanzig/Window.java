package dreiundzwanzig;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowListener;
import java.awt.event.*;

public class Window extends JFrame {

    private JTextArea area = new JTextArea(5, 50);

    public Window() {
        super("Window Event Log");
        setSize(500, 500);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JScrollPane scroll = new JScrollPane(area);
        add(scroll, BorderLayout.CENTER);

        area.setEditable(false);
        area.setFocusable(false);

        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(java.awt.event.WindowEvent e) {
                area.append(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " Window closed\n");
            }

            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                area.append(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " Window closed\n");
                JOptionPane.showMessageDialog(null, "Hit the 'x' key to close the application!");
            }

            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                area.append(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " Window closed\n");
            }

            @Override
            public void windowIconified(java.awt.event.WindowEvent e) {
                area.append(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " Window closed\n");
            }

            @Override
            public void windowDeiconified(java.awt.event.WindowEvent e) {
                area.append(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " Window closed\n");
            }

            @Override
            public void windowActivated(java.awt.event.WindowEvent e) {
                area.append(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " Window closed\n");
            }

            @Override
            public void windowDeactivated(java.awt.event.WindowEvent e) {
                area.append(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " Window closed\n");
            }
        });

        addKeyListener(new KeyAdapter() {
                           public void keyPressed(KeyEvent e) {
                               if (e.getKeyCode() == KeyEvent.VK_X) {
                                   System.exit(0);
                               }
                           }
                       }
        );
        setFocusable(true);


        setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }
}
