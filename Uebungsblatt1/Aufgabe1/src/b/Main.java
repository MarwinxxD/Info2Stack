package b;

public class Main {
	static b1 b1 = new b1();
	static b2 b2 = new b2();
	static b3 b3 = new b3();
	static b4 b4 = new b4();
	static b5 b5 = new b5();
	static b6 b6 = new b6();

	public static void main(String[] args)
	{
		System.out.println("Aufgabe b1:");
		System.out.println("Informatik in UpperCase: " + b1.upper());
		
		System.out.println("\nAufgabe b2:");
		System.out.println("erstes m in Programmieren ist an Stelle: " + b2.locate());
		
		System.out.println("\nAufgabe b3:");
		System.out.println("ersetzten von le mit abc in Parallele: " + b3.replace());
		
		System.out.println("\nAufgabe b4:");
		System.out.println("100 mal ha: " + b4.ha100().toString());
		
		System.out.println("\nAufgabe b5:");
		System.out.println("Informatik mit a an jeder zweiten Stelle: " + b5.fill());
		
		System.out.println("\nAufgabe b6:");
		System.out.println("Scanner: " + b6.scan());
	}
}
