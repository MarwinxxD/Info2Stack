package neunzehn;

import java.util.Scanner;

public class RechnerMain {
    public static void main(String[] args) throws IllegalArgumentException{
        System.out.println("Dieses Programm ist ein Rechner, welcher eine Kette von Zeichen annimmt:");
        System.out.println("Diese Zeichen müssen erste eine Zahl, dann einen Operator und dann noch eine Zahl beinhalten");
        System.out.println("Der Rechner rechnet darauffolgend das Ergebnis aus.");
        System.out.println("Mit dem Input EXIT bricht der Rechner ab.");


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
