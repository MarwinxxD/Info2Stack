package einundzwazig;

import javax.swing.*;
import java.awt.*;

public class B extends JFrame {

    public B() {
        setTitle("Grey Color Scheme");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(320, 320);

        JPanel panel = new JPanel(new GridLayout(16, 16));

        int grey = 0;

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                grey = Math.min(255, i * 16 + j * 16);
                JPanel cell = new JPanel();
                cell.setPreferredSize(new Dimension(20, 20));
                cell.setBackground(new Color(grey, grey, grey));
                panel.add(cell);
            }
        }

        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new B();
    }
}
