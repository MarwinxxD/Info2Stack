

import java.awt.*;
import java.beans.*;
import java.util.ArrayList;

/**
 * Repräsentiert den Zustand des "Katz und Mauszeiger"-Spiels.
 */
public class Game {

	// ===== CONSTANTS =====
	/**
	 * Der Radius des sich bewegenden Gegners.
	 */
    private static final int MOVING_CATCHER_RADIUS = 20;
    
    
    // ===== FIELDS =====
    /**
     * Gibt an, ob das Spiel gerade läuft.
     */
    private boolean running;
    
    /**
     * Die aktuelle Punktezahl.
     */
    private int points;
    
    /**
     * Die Gegner.
     */
    private ArrayList<Catcher> catcher;
    
    /**
     * Der sich bewegende Gegner.
     */
    private MovingCatcher mover;
    
    /**
     * Die Listener.
     */
    private PropertyChangeSupport changes = new PropertyChangeSupport(this);

    
    // ===== GETTERS =====
    /**
     * Gibt die aktuelle Punktezahl zurück.
     * 
     * @return die aktuelle Punktezahl
     */
    public int getPoints() {
        
        return points;
        
    }

    
    /**
     * Gibt zurück, ob das Spiel verloren wurde.
     * 
     * @return <code>true</code>, falls das Spiel verloren wurde; ansonsten <code>true</code>
     */
    public boolean isGameOver() {
        return !running;
    }
    
    
    // ===== CONSTRUCTORS =====
    /**
     * Erzeugt ein neues Spiel.
     * 
     * @param width die Breite des Spielfelds
     * @param height die Höhe des Spielfelds
     */
    public Game(int width, int height) {
        
        // Erzeuge einen sich bewegenden Gegner in der Mitte des Spielfelds.
        mover = new MovingCatcher(new Point(width / 2, height / 2), MOVING_CATCHER_RADIUS);
        
        // Initialisiere die Liste der Gegner und füge den sich bewegenden Gegner hinzu.
        catcher = new ArrayList<>();
        catcher.add(mover);
        
        // Initialisiere die Punkteliste und setze das Spiel auf Start.
        running = true;
        points = 0;
        
    }


    // ===== OBJECT METHODS =====
    /**
     * Startet das Spiel. Falls das Spiel bereits läuft, verändert sich der Zustand nicht.
     */
    public void start() {
        
        if (running)
            return;

        // Leere die Liste der Gegner, aber füge den sich bewegenden Gegner wieder hinzu.
        catcher.clear();
        catcher.add(mover);
        
        // Setze die Punkte zurück und starte erneut.
        points = 0;
        running = true;

        // Informiere alle Listener.
        signalChange();
        
    }

    
    /**
     * Stoppt das Spiel. Falls das Spiel bereits gestoppt ist, verändert sich der Zustand
     * nicht.
     */
    public void stop() {
        
        if (!running)
            return;
        
        // Stoppe das Spiel und informiere die Listener.
        running = false;
        signalChange();
        
    }


    /**
     * Zeichnet die Gegner.
     * 
     * @param g das Ziel, auf dem gezeichnet wird
     */
    public void drawCatchers(Graphics g) {
        
        for (Catcher c : catcher)
            c.draw(g);
        
    }

    
    /**
     * Aktualisiert den Spielzustand anhand einer neuen Mausposition.
     * 
     * @param mouse die neue Mauspositition.
     */
    public void advanceGame(Point mouse) {
        
        // Falls das Spiel nicht aktiv ist, gibt es nichts zu tun.
        if(!running)
            return;
        
        // Bei jeder Mausbewegung erhält der Spieler einen Punkt.
        points++;
        
        // Der bewegliche Gegner wird bewegt.
        mover.move(mouse);
                
        // Erzeuge alle 50 Punkte einen, alle 100 Punkte zwei, alle 200 Punkte drei und alle
        // 400 Punkte vier neue (unbewegliche) Gegner unterschiedlicher Größe in der Nähe des
        // Mauszeigers.
        int pseudoRandomSize = (points / 100) * 5;
        if(points % 50 == 0)
            catcher.add(new Catcher(
            		new Point(mouse.x + 50, mouse.y + 50), 10 + pseudoRandomSize)
            );
        if(points % 100 == 0)
            catcher.add(new Catcher(
            		new Point(mouse.x - 50, mouse.y - 50), 25 + pseudoRandomSize)
            );
        if(points % 200 == 0)
            catcher.add(new Catcher(
            		new Point(mouse.x + 50, mouse.y - 50), 15 + pseudoRandomSize)
            );
        if(points % 400 == 0)
            catcher.add(new Catcher(
            		new Point(mouse.x - 50, mouse.y + 50), 30 + pseudoRandomSize)
            );
        
        // Es wird auf Kollisionen überprüft. Bei einer Kollision ist das Spiel vorbei.
        for(Catcher c : catcher)
            if(c.collides(mouse))
                running = false;
        
        // Die Listener werden informiert.
        signalChange();
        
    }

    
    /**
     * Informiert alle Listener über eine Änderung am Spielzustand.
     */
    private void signalChange() {
        
        changes.firePropertyChange("signal", null, null);
        
    }

    
    /**
     * Registiert einen Listener für Änderungen am Spielzustand.
     * 
     * @param l der Listener
     */
    public void addPropertyChangeListener(PropertyChangeListener l) {
        
        changes.addPropertyChangeListener(l);
        
    }

    
    /**
     * Entfernt einen Listener für Änderungen am Spielzustand.
     * 
     * @param l der Listener
     */
    public void removePropertyChangeListener(PropertyChangeListener l) {
        
        changes.removePropertyChangeListener(l);
        
    }
    
}