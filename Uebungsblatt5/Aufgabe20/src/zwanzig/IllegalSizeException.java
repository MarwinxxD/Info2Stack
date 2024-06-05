package zwanzig;

public class IllegalSizeException extends Exception {
    public IllegalSizeException(double size) {
        super("Illegal size: " + size);
    }

}
