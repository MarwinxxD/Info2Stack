package dreiundzwanzig;

import javax.swing.*;
import java.awt.event.*;

public class Window extends JFrame {
    public Window() {
        setTitle("Window Event Log");

        setSize(500, 500);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_X) {
                    System.exit(0);
                }
            }
        });

        JTextArea area = new JTextArea(5, 50);
        area.setEditable(false);
        JScrollPane scrollThing = new JScrollPane(area);
        add(scrollThing);

        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                area.append(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " Window opened\n");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                area.append(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " Window closing\n");
                JOptionPane.showMessageDialog(null, "Hit the ’X’ key to close the application!");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                area.append(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " Window closed\n");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                area.append(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " Window iconified\n");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                area.append(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " Window deiconified\n");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                area.append(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " Window activated\n");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                area.append(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " Window deactivated\n");
            }
        });

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }
}
