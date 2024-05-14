package bpdrei;
import java.util.List;

public class PokedexViewer {

	public static void main(String[] args) {
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

		dex.sort(Pokemon::compareTo);

		System.out.println("\n\n");

		System.out.println(tableHeader);

		System.out.println(headerLine);

		dex.forEach((Pokemon mon) -> {
			System.out.println(fillForTable(mon.name) + fillForTable(mon.type1)
					+ (mon.type2 == null ? fillForTable("") : fillForTable(mon.type2)));
		});
		System.out.println(headerLine);
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
		if(string.length() > columnWidth)
			result = string.substring(0, columnWidth - 3) + "...";
		
		// Falls das Feld nicht breit genug ist, werden Leerzeichen aufgefüllt.
		else {
			result = string;
			for(int i = 0; i < columnWidth - string.length(); i++)
				result += " ";
		}
		
		// Am Ende wird ein Trenner ergänzt.
		result += separator;
		return result;
		
	}

}
