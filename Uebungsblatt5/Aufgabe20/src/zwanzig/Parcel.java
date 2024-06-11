package zwanzig;

public class Parcel extends RealEstate {
    double size;

    @Override
    public double getPricePerCubic() {
        return this.getPrice() / size;
    }

    @Override
    public void setSize(double size) throws IllegalSizeException {
        if(size > 250) {
            this.size = size;
        } else {
            throw new IllegalSizeException(size);
        }
    }
}
