package zwanzig;

public class Apartment extends RealEstate {
    double size;

    @Override
    public double getPricePerCubic() {
        return getPrice() / size;
    }

    @Override
    public void setSize(double size) throws IllegalSizeException {
        if(size >= 20 && size <= 120) {
            this.size = size;
        } else {
            throw new IllegalSizeException(size);
        }
    }
}
