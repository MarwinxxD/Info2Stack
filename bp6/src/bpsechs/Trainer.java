package bpsechs;

import java.util.ArrayList;

public class Trainer {
    private static final Integer MAX_TEAM_SIZE = 6;
    private final String name;
    ArrayList<Pokemon> pokemons;
    Integer nextPokemon;

    public Trainer(String name, Pokemon firstPokemon) throws IllegalArgumentException {
        if(firstPokemon != null) {
            pokemons = new ArrayList<>(MAX_TEAM_SIZE);
            pokemons.add(firstPokemon);
        } else {
            throw new IllegalArgumentException("the first Pokemon is non existant");
        }
        nextPokemon = 0;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean canFight() {
        return !pokemons.isEmpty();
    }

    public void addPokemon(Pokemon pokemon) throws IllegalArgumentException, IllegalStateException {
        if (pokemons.size() < MAX_TEAM_SIZE) {
            if (pokemon != null) {
                pokemons.add(pokemon);
            } else {
                throw new IllegalArgumentException("the Pokemon is non existant");
            }
        } else {
            throw new IllegalStateException("the Trainer already has " + MAX_TEAM_SIZE + " Pokemon");
        }
    }

    public Pokemon getNextPokemon() {
        if (pokemons.size() > nextPokemon) {
            Pokemon ret = pokemons.get(nextPokemon);
            nextPokemon++;
            return ret;
        }
        return null;
    }

    public String teamToString() {
        String ret = "";

        for (int i = 0; i < pokemons.size(); i++) {
            System.out.print(pokemons.get(i));

            ret = ret.concat(pokemons.get(i).toString());

            if (pokemons.get(i).isFainted()) {
                System.out.println(" is Fainted");

                ret = ret.concat(" is Fainted\n");
            } else {
                System.out.println();

                ret = ret.concat("\n");
            }
        }
        return ret;
    }

    @Override
    public String toString() {
        return name + " with " + pokemons.size() + " Pokemon";
    }
}
