package bc;

public class Truck extends Vehicle {
    int maxGew;

    public Truck(String zeichen) {
        super(zeichen);
    }

    @Override

    double mietpreis() {
        return maxGew * 10;
    }

    @Override
    public String toString() {
        return super.toString() + " Maximum weight: " + this.getMaxGew() + " Rental price: " + this.mietpreis();
    }

    public int getMaxGew() {
        return maxGew;
    }

    public void setMaxGew(int gew) {
        maxGew = gew;
    }
}
