package zwanzig;

public class ImmoApp {
    public static void main(String[] args) throws IllegalSizeException, IllegalPriceException {
        Parcel parcel = new Parcel();
        Apartment apartment = new Apartment();

        try {
            parcel.setPrice(500000);
            parcel.setSize(1000);
            System.out.println("The parcels price per cubic meter is: " + parcel.getPricePerCubic());
        } catch (IllegalSizeException se) {
            se.printStackTrace();
        } catch (IllegalPriceException pe) {
            System.err.println(pe.getMessage());
        }

        try {
            apartment.setPrice(450000);
            apartment.setSize(150);
            System.out.println("The apartments price per cubic meter is: " + apartment.getPricePerCubic());
        } catch (IllegalSizeException se) {
            se.printStackTrace();
        } catch (IllegalPriceException pe) {
            System.err.println(pe.getMessage());
        }
    }
}
