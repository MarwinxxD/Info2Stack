package neunzehn;

import java.util.Scanner;

public class RechnerMain {
    public static void main(String[] args) throws IllegalArgumentException{
        System.out.println("Dieses Programm ist ein Rechner, welcher eine Kette von Zeichen annimmt:");
        System.out.println("Diese Zeichen müssen erste eine Zahl, dann einen Operator und dann noch eine Zahl beinhalten");
        System.out.println("annimmt und das Ergebnis ausgibt.");

        System.out.println("\nBitte gib deine gewünschte Rechnung ein!");

        Scanner sc = new Scanner(System.in);

        Rechner rechner = new Rechner();

        while (true) {
            String str = sc.nextLine();

            if (str.equals("EXIT")) {
                break;
            }

            try {
                rechner.rechnen(str);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
