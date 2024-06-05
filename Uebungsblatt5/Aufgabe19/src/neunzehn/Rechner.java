package neunzehn;

public class Rechner {

    public void rechnen(String str) throws NumberFormatException, IllegalArgumentException{
        int x, y;

        String[] erg = str.split("[\\x2B\\x2D\\x2A\\x2F]");

        if (erg.length > 3) {
            throw new IllegalArgumentException("Zu viele Inputs");
        } else if (erg.length < 3) {
            throw new IllegalArgumentException("Zu wenige Inputs");
        }

        if(erg[0].matches("[\\x2B\\x2D\\x2A\\x2F]")
                || erg[2].matches("[\\x2B\\x2D\\x2A\\x2F]")) {
            throw new IllegalArgumentException("Zu viele Operatoren");
        }

        try {
            x = Integer.parseInt(erg[0]);
            y = Integer.parseInt(erg[2]);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Die erste und/oder zweite Zahl ist illegal");
        }

        if(erg[1].charAt(0) == '+') {
            System.out.println("= " + x + y);
        } else if (erg[1].charAt(0) == '-') {
            System.out.println("= " +  - y);
        } else if (erg[1].charAt(0) == '*') {
            System.out.println("= " + x * y);
        }
        System.out.println("= " + x / y);
    }
}
