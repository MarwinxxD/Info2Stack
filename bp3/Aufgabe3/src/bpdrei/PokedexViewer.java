package bpdrei;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PokedexViewer {

	public static void main(String[] args) {
		Stream<Pokemon> streamdex = Pokedex.stream();

		String tableHeader = fillForTable("Name") + fillForTable("Typ 1")
				+ fillForTable("Typ 2");

		String headerLine = "--------------+---------------+---------------+ ";

		System.out.println(tableHeader);

		System.out.println(headerLine);

		List<Pokemon> dex = Pokedex.list();

		dex.forEach((Pokemon mon) -> {
			System.out.println(fillForTable(mon.name) + fillForTable(mon.type1)
					+ (mon.type2 == null ? fillForTable("") : fillForTable(mon.type2)));
		});

		System.out.println(headerLine);

		System.out.println("\n" + "--------------------------------------------------- Alphabetical order" + "\n");

		Comparator<Pokemon> compare = (Pokemon a, Pokemon b) -> a.name.toLowerCase().compareTo(b.name.toLowerCase());

		dex.sort(compare);

		System.out.println(tableHeader);

		System.out.println(headerLine);

		dex.forEach((Pokemon mon) -> {
			System.out.println(fillForTable(mon.name) + fillForTable(mon.type1)
					+ (mon.type2 == null ? fillForTable("") : fillForTable(mon.type2)));
		});

		System.out.println(headerLine);

		System.out.println("\n" + "--------------------------------------------------- only Gen one Pokes (and no Megas)" + "\n");

		Predicate<Pokemon> filter = p -> p.number >= 1 && p.number <= 151 && !(p.name.contains("Mega"));

		/*streamdex = Pokedex.stream().filter(filter);

		streamdex.forEach((Pokemon mon) -> {
			System.out.println(fillForTable(mon.name) + fillForTable(mon.type1)
					+ (mon.type2 == null ? fillForTable("") : fillForTable(mon.type2)));
		});*/

		streamdex = Pokedex.stream().filter(filter);

		System.out.println("Die Anzahl aller Pokemon in den Gen 1 one Games = " + streamdex.count());

		System.out.println("\n" + "--------------------------------------------------- Ten highest Defence values" + "\n");

		streamdex = Pokedex.stream();

		Comparator<Pokemon> defence = (Pokemon a, Pokemon b) -> Integer.compare(b.defence, a.defence);

		streamdex = streamdex.sorted(defence);

		streamdex = streamdex.limit(10);

		streamdex.forEach((Pokemon mon) -> {
			System.out.println(fillForTable(mon.name) + fillForTable(mon.type1)
					+ (mon.type2 == null ? fillForTable("") : fillForTable(mon.type2)));
		});


		System.out.println("\n" + "--------------------------------------------------- average HP-stat" + "\n");

		Predicate<Pokemon> gen2 = p -> p.number >= 152 && p.number <= 256 && !(p.name.contains("Mega"));
		System.out.println("Der Durchschnittliche HP-stat aller Gen 2 Pokemon (ohne Megas) = " +
		Pokedex.stream()
				.filter(gen2)
				.mapToInt((Pokemon a) -> a.hp).average());

		System.out.println("\n" + "--------------------------------------------------- only Gen one Pokes (and no Megas)" + "\n");

		streamdex = Pokedex.stream();

		streamdex = streamdex.sorted(compare);

		Predicate<Pokemon> required = a -> a.number >= 1 && a.number <= 151 && a.type1 != null && a.type2 != null && a.specialAttack >= 120;

		streamdex = streamdex.filter(required);

		System.out.println("Das erste Pokemon der Gen 1 mit zwei Typen und mindestens 120 SpAt:");

		streamdex.findFirst().ifPresent(System.out::println);
	}

	
	/**
	 * Kürzt einen {@link String} oder füllt ihn mit Leerzeichen auf, sodass er in einer
	 * Tabelle verwendet werden kann.
	 * 
	 * @param string der in der Tabelle verwendete String
	 * 
	 * @return
	 * 		ein {@link String}, der für eine Tabelle geeignet ist
	 */
	private static String fillForTable(String string) {

		final int columnWidth = 13;
		final String separator = " | ";
		String result = "";

		// Falls das Feld zu breit ist, wird es gekürzt.
		if (string.length() > columnWidth)
			result = string.substring(0, columnWidth - 3) + "...";

			// Falls das Feld nicht breit genug ist, werden Leerzeichen aufgefüllt.
		else {
			result = string;
			for (int i = 0; i < columnWidth - string.length(); i++)
				result += " ";
		}

		// Am Ende wird ein Trenner ergänzt.
		result += separator;
		return result;

	}
}
