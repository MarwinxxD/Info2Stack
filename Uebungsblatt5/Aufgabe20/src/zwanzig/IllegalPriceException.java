package zwanzig;

public class IllegalPriceException extends Exception {
    public IllegalPriceException(double price) {
        super("Illegal price: " + price);
    }
}
