package vierundzwanzig;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class A extends JPanel {
    private Point start;
    private Point ende;
    private Rectangle currRect;

    public A() {
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.WHITE);

        MouseAdapter mouseListen = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                start = e.getPoint();
                ende = start;
                currRect = null;
                repaint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                ende = e.getPoint();
                calculateRectangle();
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                ende = e.getPoint();
                calculateRectangle();
                repaint();
            }

            private void calculateRectangle() {
                int x = Math.min(start.x, ende.x);
                int y = Math.min(start.y, ende.y);
                int width = Math.abs(start.x - ende.x);
                int height = Math.abs(start.y - ende.y);
                currRect = new Rectangle(x, y, width, height);
            }
        };

        this.addMouseListener(mouseListen);
        this.addMouseMotionListener(mouseListen);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (currRect != null) {
            g.setColor(Color.BLACK);
            g.drawRect(currRect.x, currRect.y, currRect.width, currRect.height);
            g.setColor(Color.GREEN);
            g.drawString("Breite: " + currRect.width,
                    currRect.x + currRect.width / 2 - 20,
                    currRect.y - 5);
            g.drawString("Höhe: " + currRect.height,
                    currRect.x + currRect.width + 5,
                    currRect.y + currRect.height / 2);
        }
    }
}
