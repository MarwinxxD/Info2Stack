package bc;

public class Car extends Vehicle {
    private int sitzplaetze;

    public Car(String zeichen) {
        super(zeichen);
    }

    @Override
    double mietpreis() {
        return sitzplaetze * 2.5;
    }

    @Override
    public String toString() {
        return super.toString() + " Sitzplaetze: " + this.getSitzplaetze() + " Rental price: " + this.mietpreis();
    }

    public int getSitzplaetze() {
        return sitzplaetze;
    }

    public void setSitzplaetze(int sitze) {
        sitzplaetze = sitze;
    }
}
