package bpsieben;

/**
 * Testet die Implementierung der Aufgabe zum VideoManager.
 */
public class VideoTesterApp {

    /**
     * Einstiegspunkt für das Programm.
     * 
     * @param args wird ignoriert
     */
    public static void main(String[] args) {

        // Erzeuge VideoManager.
        VideoManager manager = new VideoManager();
        
        // Erzeuge Film, füge ihn aber nicht hinzu, und versuche, ihn zu entfernen.
        Movie m = new Movie("Man of Steel", 8.9);
        if(manager.removeVideo(m))
            System.err.println("Video " + m + " konnte gelöscht werden, obwohl es nie "
                    + "hinzugefügt wurde.");

        // Erzeuge einige gültige Videos und füge sie hinzu.
        manager.addVideo(new Movie("Waterboy", 4.1));
        manager.addVideo(new Movie("Interstellar", 8.7));
        manager.addVideo(new Movie("Matrix", 9.2));
        manager.addVideo(new Series("Lupin", 9.8));
        manager.addVideo(new Series("Loki", 11.0));
        manager.addVideo(new Movie("James Bond - No Time to Die", 9.4));
        manager.addVideo(new Movie("Black Widow", 9.1));
        manager.addVideo(new Movie("The Italian Job", 8.3));
        manager.addVideo(new Movie("Schindlers Liste", 8.4));
        manager.addVideo(new Movie("Once Upon a Time... in Hollywood", 9));
        manager.addVideo(new Movie("Tenet", 7.8));
        manager.addVideo(new Series("Teletubbies", -9999));
        manager.addVideo(new Series("Chernobyl", 9.5));
        manager.addVideo(new Series("The Falcon and the Winter Soldier", 8.8));
        manager.addVideo(new Movie("Wiener Dog", -10));
        manager.addVideo(new Series("Mr. Robot", 9.3));

        // Versuch, ein gültiges Videos nochmals hinzuzufügen
        try {
            Series mrRobot = new Series("mr. robot", 8.2);
            manager.addVideo(mrRobot);
            System.err.println("Video " + mrRobot.toString() + " konnte doppelt hinzugefügt "
                    + "werden.");
        } catch(IllegalArgumentException e) {
            
        }
        
        // Versuch, null als Video hinzuzufügen
        try {
            manager.addVideo(null);
            System.err.println("null konnte als Video hinzugefügt werden");
        } catch(NullPointerException e) {
            
        }
        
        // Versuch, ein ungütliges Video hinzuzufügen.
        try {
            manager.addVideo(new Series("", 3));
            System.err.println("Ein ungültiges Video konnte hinzugefügt werden.");
        } catch(IllegalArgumentException e) {
            
        }

        // Versuch, ob der Vergleich mit null fehlschlägt.
        if(new Series("House MD", 9.9).equals(null))
            System.err.println("Der Vergleich eines Videos mit null schlägt nicht fehl.");

        // Gib alle Videos nach Beliebtheit aus. Lösche dabei die Videos.
        System.out.println("Nach Beliebtheit sortierte Videos:");
        for(Video video : manager.getSortedVideoArray()) {
            if(video == null)
                System.err.println("null ist in der Liste der Videos.");
            else
                System.out.println(video);
            manager.removeVideo(video);
        }
        
        // Überprüfe, ob noch Videos da sind.
        System.out.println("Alle Videos wurden gelöscht.");
        if(manager.getSortedVideoArray().length == 0)
            System.out.println("Es sind keine Videos mehr vorhanden.");
        else
            System.err.println("Dennoch sind Videos vorhanden.");
        
    }
    
}