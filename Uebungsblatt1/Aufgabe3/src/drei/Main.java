package drei;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static a a = new a();
	static b b = new b();
	static c c = new c();
	static d d = new d();
	
	public static void main(String[] args)
	{	
		int[] iarr = {6, 9, 10, 5};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gibt einen String ein ");
		System.out.println("in nur Kleinbuchstaben = " + a.myToLowerCase(scan.nextLine()));
		System.out.println();
		
		System.out.println("gib drei Zahlen ein");
		System.out.println("Der Maximalwert der Zahlen = " + b.tripleMax(scan.nextInt(), scan.nextInt(), scan.nextInt()));
		System.out.println();
		
		System.out.println("Das Array ist: " + Arrays.toString(iarr));
		System.out.println("das produkt aller Array Werte = " + c.arrayprod(iarr));
		System.out.println();
		
		scan.nextLine();
		System.out.println("gib Zahlen ein");
		System.out.println("die Summe aller Inputs = " + d.summ(scan.nextLine()));
		System.out.println();
		scan.close();
	}
}
