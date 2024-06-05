package neunzehn;

import java.util.Scanner;

public class RechnerMain {
    public static void main(String[] args) throws IllegalArgumentException{
        System.out.println("Dieses Programm ist ein Rechner, welcher Eingaben im Format:");
        System.out.println("'Zahl'Leerzeichen'Operator'Leerzeichen'Zahl'");
        System.out.println("annimmt und das Ergebnis ausgibt.");

        System.out.println("\nBitte gib deine gewünschte Rechnung ein!");

        Scanner sc = new Scanner(System.in);

        Rechner rechner = new Rechner();

        while (true) {
            String x = sc.next();

            if (x.equals("EXIT")) {
                break;
            }

            try {
                rechner.setX(x);
                rechner.setOperator(sc.next());
                rechner.setY(sc.next());
                rechner.rechnen();
            } catch (Exception e) {
                sc.nextLine();
                e.printStackTrace();
            }

        }
    }
}
