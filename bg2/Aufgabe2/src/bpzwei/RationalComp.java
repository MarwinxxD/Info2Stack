package bpzwei;

import java.util.Scanner;

public class RationalComp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bitte gib zwei ganze Zahlen ein: ");

        Fraction fract1 = new Fraction(scan.nextInt(), scan.nextInt());
        System.out.println("Es wurde " + fract1.toString() + " eingegeben.");

        System.out.print("Bitte gib zwei ganze Zahlen ein: ");

        Fraction fract2 = new Fraction(scan.nextInt(), scan.nextInt());
        System.out.println("Es wurde " + fract2.toString() + " eingegeben.");

        if (fract1.compareTo(fract2) > 0) {
            System.out.print(fract1.toString() + " ist groesser");
        } else if (fract1.compareTo(fract2) < 0) {
            System.out.print(fract2.toString() + " ist groesser");
        } else {
            System.out.print(fract1.toString() + " und " +fract2.toString() + " sind gleich gross");
        }



        /*System.out.print("Bitte gib eine ganze Zahl ein: ");

        IntegerNumber readNumber = new IntegerNumber(scan.nextInt());

        System.out.println("Es wurde " + readNumber.toString() + " eingegeben.");

        if(readNumber.isZero()) {
            System.out.println("Die Zahl ist null");
        } else {
            System.out.println("Die Zahl ist nicht null");
        }

        if (readNumber.isPositive()) {
            System.out.println("Die Zahl ist positiv");
        } else {
            System.out.println("Die Zahl ist nicht positiv");
        }*/

        /*System.out.print("Bitte gib zwei ganze Zahlen ein: ");

        Fraction fract = new Fraction(scan.nextInt(), scan.nextInt());
        System.out.println("Es wurde " + fract.toString() + " eingegeben.");

        if(fract.isZero()) {
            System.out.println("Der Bruch ist null");
        } else {
            System.out.println("Der Bruch ist nicht null");
        }

        if (fract.isPositive()) {
            System.out.println("Der Bruch ist positiv");
        } else {
            System.out.println("Der Bruch ist nicht positiv");
        }*/


        scan.close();
    }
}