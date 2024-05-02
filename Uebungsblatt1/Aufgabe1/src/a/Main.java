package a;

public class Main {
	static a1 a1 = new a1();
	static a2 a2 = new a2();
	static a3 a3 = new a3();
	static a4 a4 = new a4();
	
	
	public static void main(String[] args)
	{
		System.out.println("Aufgabe a1:");
		System.out.println("sin(2.5) · √5 = " + a1.doCalcsinsqrt());
		
		System.out.println("\nAufgabe a2:");
		System.out.println("Minumum von log10(2534) = " + a2.doCalcLog());
		System.out.println("Minumum von e^2 = " + a2.doCalcEuler());
		
		System.out.println("\nAufgabe a3:");
		System.out.println("Das Vorzeichen von tan(42) = " + a3.doCalctan());
		
		System.out.println("\nAufgabe a4:");
		System.out.println("Der String 2436 als int mal 2 = "  + a4.doCalcInt());
	}
}
