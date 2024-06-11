package BP6;

import java.util.ArrayList;

import BP6.Pokemon;

public class Trainer {

	private final int MAX_TEAM_SIZE = 6;

	private String name;

	ArrayList<Pokemon> pokemon;

	private int nextPokemon = 0;
	

	Trainer(String name, Pokemon firstPokemon) {

		if (firstPokemon == null) {
			throw new IllegalArgumentException("u are wrong, u don't have pokemons ");
		} else {
			pokemon = new ArrayList<>(0);
			pokemon.add(firstPokemon);
			nextPokemon = 0;
			this.name = name;
		}
	}

	public String getName() {
		return name;
	}

	public boolean canFight() {
		
		if (pokemon.size() == 0) {
			return false;
		}else {
			return true;
		}

	}

	public void addPokemon(Pokemon newPokemon) {

		if (pokemon.size() >= MAX_TEAM_SIZE) {
			throw new IllegalArgumentException("u are wrong, u have tooooooo may pokemons ");
		} else {
			if (pokemon.size() == 0) {
				throw new IllegalArgumentException("u are wrong, u don't have pokemons ");
			} else {
				pokemon.add(newPokemon);
			}
		}

	}

	public Pokemon getNextPokemon() {
		if (pokemon.size() > nextPokemon) {
			Pokemon next = pokemon.get(nextPokemon);
			nextPokemon++;
			return next;
		}
		return null;
	}

	@Override
	public String toString() {
		return name + pokemon.size();
	}

	
	public String teamToString() {

		String next = "";

        for (int i = 0; i < pokemon.size(); i++) {
            System.out.print(pokemon.get(i));

            next = next.concat(pokemon.get(i).toString());

            if (pokemon.get(i).isFainted()) {
                System.out.println(" is Fainted");

                next = next.concat(" is Fainted\n");
            } else {
                System.out.println();

                next = next.concat("\n");
            }
        }
        return next;
    }
		
	
}
