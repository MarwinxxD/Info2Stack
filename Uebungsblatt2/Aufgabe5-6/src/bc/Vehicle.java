package bc;

public abstract class Vehicle {
    public String kennzeichen;
    public int anzahl;

    public Vehicle (String zeichen) {
        kennzeichen = zeichen;
        anzahl++;
    }

    abstract double mietpreis();

    @Override
    public String toString() {
        return kennzeichen;
    }

    String getKennzeichen() {
        return kennzeichen;
    }

    void setKennzeichen(String kenn) {
        kennzeichen = kenn;
    }
}
