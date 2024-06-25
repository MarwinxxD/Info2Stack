package bpacht;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class GameField extends JPanel implements PropertyChangeListener {
    Game game;

    public GameField(Game g) {
        game = g;
        game.addPropertyChangeListener(this);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                game.start();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                game.stop();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                game.advanceGame(e.getPoint());
            }
            @Override
            public void mouseDragged(MouseEvent e) {
                game.advanceGame(e.getPoint());
            }
        });
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        game.drawCatchers(g);
    }
}
