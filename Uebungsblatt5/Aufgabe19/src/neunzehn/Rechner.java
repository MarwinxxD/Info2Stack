package neunzehn;

import java.util.Arrays;

public class Rechner {

    public void rechnen(String str) throws NumberFormatException, IllegalArgumentException{
        int x, y;

        String[] erg = str.split("[\\x2B\\x2D\\x2A\\x2F]");

        if (erg.length > 2) {
            throw new IllegalArgumentException("Zu viele Inputs");
        } else if (erg.length < 2) {
            throw new IllegalArgumentException("Zu wenige Inputs");
        }

        erg[0] = erg[0].replaceAll("\\s+", "");
        erg[1] = erg[1].replaceAll("\\s+", "");

        if(erg[0].matches("[\\x2B\\x2D\\x2A\\x2F]")
                || erg[1].matches("[\\x2B\\x2D\\x2A\\x2F]")) {
            throw new IllegalArgumentException("Zu viele Operatoren");
        }

        try {
            x = Integer.parseInt(erg[0]);
            y = Integer.parseInt(erg[1]);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Die erste und/oder zweite Zahl ist illegal");
        }

        if(str.contains("+")) {
            System.out.println("= " + (x + y));
        } else if (str.contains("-")) {
            System.out.println("= " + (x - y));
        } else if (str.contains("*")) {
            System.out.println("= " + (x * y));
        } else {
            System.out.println("= " + (x / y));
        }
    }
}
