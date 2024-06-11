package zwanzig;

public abstract class RealEstate {
    int price;

    public abstract double getPricePerCubic();

    public abstract void setSize(double size) throws IllegalSizeException;

    public int getPrice() {return price;}

    public void setPrice(int _price) throws IllegalPriceException {
        if(_price > 10000 && _price % 1000 == 0) {
            price = _price;
        } else {
            throw new IllegalPriceException(_price);
        }
    }
}
