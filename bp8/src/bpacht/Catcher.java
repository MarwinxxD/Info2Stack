package bpacht;

import java.awt.*;

/**
 * Diese Klasse repräsentiert die Gegner des Mauszeigers. Normale <code>Catcher</code> bewegen
 * sich dabei nicht. {@link MovingCatcher} repräsentieren den sich bewegenden Gegner.
 */
public sealed class Catcher permits MovingCatcher {
  
    // ===== FIELDS =====
    /**
     * Der Mittelpunkt dieses Gegners.
     */
    protected Point center;
    
    /**
     * Die obere linke Ecke dieses Gegners.
     */
    protected Point corner;
    
    /**
     * Der Radius dieses Gegners.
     */
    protected int radius;
    
    /**
     * Die Breite und Höhe dieses Gegners.
     */
    protected int length;

    
    // ===== CONSTRUCTORS =====
    /**
     * Erzeugt einen neuen Gegner.
     * 
     * @param center der Mittelpunkt
     * @param radius der Radius
     * 
     * @throws IllegalArgumentException falls der Radius nicht positiv ist
     */
    public Catcher(Point center, int radius) {
        
        if(radius <= 0)
            throw new IllegalArgumentException("radius must be positive");
        this.center = center;
        this.radius = radius;
        
        // Die Breite (und Höhe) ist der doppelte Radius.
        length = radius * 2;
        
        // Der linke obere Eckpunkt wird vom Mittelpunkt aus errechnet.
        corner = new Point(center.x - radius, center.y - radius);
        
    }

    
    // ===== OBJECT METHODS =====
    /**
     * Zeichnet den Gegner
     * 
     * @param g das Ziel, auf dem gezeichnet wird
     */
    public void draw(Graphics g) {
        
        // Es wird ein Kreis gezeichnet.
        g.drawOval(corner.x, corner.y, length, length);
        
    }

    
    /**
     * Überprüft, ob ein Punkt innerhalb des Gegners ist.
     * 
     * @param p der Punkt, mit dem die Kollision überprüft werden soll
     * 
     * @return
     *         <code>true</code> falls der Punkt innerhalb des Gegners liegt; ansonsten
     *         <code>false</code>.
     */
    public boolean collides(Point p) {
        
        return center.distance(p) < radius;
        
    }
    
}