package achtzehn;

import java.util.regex.Pattern;

public class Luggage {
    String Besitzer = "";
    double Gewicht;
    Pattern p = Pattern.compile("[A-Z]{2}[0-9]{2}");
    String FlugID;

    public Luggage(String ID, String bes, double gew) throws IllegalArgumentException {
        setFlugID(ID);
        setOwner(bes);
        setWeight(gew);
    }

    public void setOwner(String besitzer) throws IllegalArgumentException {
        if (!besitzer.isEmpty()) {
            Besitzer = besitzer;
        } else {
            throw new IllegalArgumentException("Der Besitzer ist leer");
        }
    }

    public void setWeight(double weight) throws IllegalArgumentException {
        if (weight > 0) {
            Gewicht = weight;
        } else {
            throw new IllegalArgumentException("Das Gewicht ist nicht positiv");
        }
    }

    public void setFlugID(String flugID) throws IllegalArgumentException {
        if (p.matcher(flugID).matches()) {
            FlugID = flugID;
        } else {
            throw new IllegalArgumentException("Die Flug-ID ist illegal");
        }
    }

    public String getOwner() {
        return Besitzer;
    }

    public double getWeight() {
        return Gewicht;
    }

    public String getFlugID() {
        return FlugID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash = 53 * hash + this.Besitzer.hashCode();
        hash = 53 * hash + this.FlugID.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Luggage l) {
            return this.FlugID.equals(l.FlugID) && this.Besitzer.equals(l.Besitzer);
        }
        return false;
    }


}
