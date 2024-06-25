

import java.awt.*;

/**
 * Diese Klasse repräsentiert einen sich bewegenden Gegner.
 */
public final class MovingCatcher extends Catcher {

    // ===== CONSTANTS =====
    /**
     * Die Farbe für diesen Gegner.
     */
    private static final Color COLOR = Color.ORANGE;
    
    /**
     * Die Geschwindigkeit dieses Gegners.
     */
    private static final int SPEED = 1;

    
    // ===== CONSTRUCTORS =====
    /**
     * Erzeugt einen sich bewegenden Gegner.
     * 
     * @param center der Mittelpunkt
     * @param radius der Radius
     * 
     * @throws IllegalArgumentException falls der Radius nicht positiv ist
     */
    public MovingCatcher(Point center, int radius) {
        
        super(center, radius);
        
    }

    
    // ===== OBJECT METHODS =====
    @Override
    public void draw(Graphics g) {
        
        // Der sich bewegende Gegner hat eine andere Farbe. Die alte Farbe wird
    	// zwischengespeichert, der Gegner gemalt und anschließend die Farbe wieder 
    	// zurückgesetzt.
        Color previousColor = g.getColor();
        g.setColor(COLOR);
        g.fillOval(corner.x, corner.y, length, length);
        g.setColor(previousColor);
        
    }

    
    /**
     * Bewegt den Gegner in Richtung des Mauszeigers.
     * 
     * @param mouse die Position des Mauszeigers.
     */
    public void move(Point mouse) {
        
        // Der Gegner bewegt sich entweder horizontal oder vertikal. Es wird der größere der
    	// beiden Abstände ermittelt und sich im Anschluss entlang dieser Richtung zum
    	// Mauszeiger bewegt.
        final int horizontalDifference = mouse.x - this.center.x;
        final int verticalDifference = mouse.y - this.center.y;
        
        // Falls die Maus horizontal weiter entfernt ist ...
        if(Math.abs(horizontalDifference) > Math.abs(verticalDifference)) {
            // ... bewege ich mich nach rechts, falls die Maus rechts von mir ist.
            if(mouse.x > this.center.x) {
                this.center.translate(SPEED, 0);
                this.corner.translate(SPEED, 0);
            }
            // ... bewege ich mich nach links, falls die Maus links von mir ist.
            else {
                this.center.translate(-SPEED, 0);
                this.corner.translate(-SPEED, 0);
            }
        }
        
        // Analog, falls die Maus vertikal weiter entfernt ist.
        else {
            if (mouse.y > this.center.y) {
                this.center.translate(0, SPEED);
                this.corner.translate(0, SPEED);
            } else {
                this.center.translate(0, -SPEED);
                this.corner.translate(0, -SPEED);
           }
        }
    
    }
    
}