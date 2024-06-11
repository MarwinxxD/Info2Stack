package bpsechs;

/**
 * Programmklasse für die PokeTrainerApp.
 */
public class PokeTrainerApp {

    /**
     * Einstiegspunkt für das Programm. 
     * 
     * @param args wird ignoriert
     */
    public static void main(String[] args) {
        
        // Erzeuge einen Trainer mit nur einem Pokémon. Gib die Infos dazu aus.
        Trainer ash = new Trainer("Ash Ketchum", new Pokemon("Pikachu", 100));
        System.out.println(ash);
        System.out.println(ash.teamToString());
        
        // Erzeuge einen Trainer mit sechs Pokémion. Gib die Infos dazu aus.
        Trainer blue = new Trainer("Blau", new Pokemon("Tauboss", 180));
        blue.addPokemon(new Pokemon("Simsala", 142));
        blue.addPokemon(new Pokemon("Rihorn", 177));
        blue.addPokemon(new Pokemon("Kokowei", 201));
        blue.addPokemon(new Pokemon("Arkani", 195));
        blue.addPokemon(new Pokemon("Turtok", 186));
        System.out.println(blue);
        System.out.println(blue.teamToString());
        
        // Simuliere einen Kampf mit den ersten drei Pokémon des Trainers Blau.
        Pokemon firstPokemon = blue.getNextPokemon();
        firstPokemon.takeDamage(150); System.out.println(firstPokemon);
        firstPokemon.takeDamage(100); System.out.println(firstPokemon);
        Pokemon secondPokemon = blue.getNextPokemon();
        secondPokemon.takeDamage(140); System.out.println(secondPokemon);
        secondPokemon.heal(50); System.out.println(secondPokemon);
        secondPokemon.takeDamage(140);    System.out.println(secondPokemon);
        Pokemon thirdPokemon = blue.getNextPokemon();
        thirdPokemon.takeDamage(150); System.out.println(thirdPokemon);
        thirdPokemon.heal(); System.out.println(thirdPokemon);
        
        // Gib noch einmal das Team von Blau aus.
        System.out.println();
        System.out.println(blue.teamToString());
        
    }

}
