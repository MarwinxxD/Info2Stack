package bpacht;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Gui extends JFrame implements PropertyChangeListener {
    Game game;
    JTextField statusField;

    public Gui() {
        setTitle("Katz und Mauszeiger");

        game = new Game(400, 400);
        game.addPropertyChangeListener(this);

        statusField = new JTextField("");
        statusField.setEditable(false);
        add(statusField, BorderLayout.SOUTH);

        add(new GameField(game), BorderLayout.CENTER);

        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        repaint();
        if (!game.isGameOver()) {
            statusField.setText("Spiel läuft! Punkte: " + game.getPoints());
        } else {
            statusField.setText("Spiel vorbei! Punkte: " + game.getPoints());
        }
    }
}
