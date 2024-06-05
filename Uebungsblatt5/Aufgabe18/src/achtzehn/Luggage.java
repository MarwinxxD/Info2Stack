package achtzehn;

import java.util.regex.Pattern;

public class Luggage {
    String besitzer = "";
    double gewicht;
    Pattern p = Pattern.compile("[A-Z]{2}[0-9]{2}");
    String flugID;

    public Luggage(String ID, String bes, double gew) throws IllegalArgumentException {
        setFlugID(ID);
        setOwner(bes);
        setWeight(gew);
    }

    public void setOwner(String besitzer) throws IllegalArgumentException {
        if (!besitzer.isEmpty()) {
            this.besitzer = besitzer;
        } else {
            throw new IllegalArgumentException("Der Besitzer ist leer");
        }
    }

    public void setWeight(double weight) throws IllegalArgumentException {
        if (weight > 0) {
            gewicht = weight;
        } else {
            throw new IllegalArgumentException("Das Gewicht ist nicht positiv");
        }
    }

    public void setFlugID(String flugID) throws IllegalArgumentException {
        if (p.matcher(flugID).matches()) {
            this.flugID = flugID;
        } else {
            throw new IllegalArgumentException("Die Flug-ID ist illegal");
        }
    }

    public String getOwner() {
        return besitzer;
    }

    public double getWeight() {
        return gewicht;
    }

    public String getFlugID() {
        return flugID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash = 53 * hash + this.besitzer.hashCode();
        hash = 53 * hash + this.flugID.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Luggage l) {
            return this.flugID.equals(l.flugID) && this.besitzer.equals(l.besitzer);
        }
        return false;
    }


}
