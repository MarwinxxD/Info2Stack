package achtundzwanzig;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private static final double PRICE = 300.50;

    private int spaces;
    private int availableSpaces;

    private static final List<Garage> garagenListe = new ArrayList<>();

    public Garage() {
        spaces = 10;
        garagenListe.add(this);
    }

    public Garage(int _spaces) throws GarageException {
        try {
            setSpaces(_spaces);
            availableSpaces = _spaces;
            garagenListe.add(this);
        } catch (GarageException e) {
            throw new GarageException(e.getMessage());
        }
    }

    public Garage(int _spaces, int _availableSpaces) throws GarageException {
        try {
            setAvailableSpaces(_availableSpaces);
            spaces = _spaces;
            garagenListe.add(this);
        } catch (GarageException e) {
            throw new GarageException(e.getMessage());
        }
    }

    private boolean checkAvailableSpaces(int _availableSpaces) {
        return _availableSpaces >= 0 && spaces >= _availableSpaces;
    }

    public void setAvailableSpaces(int _availableSpaces) throws GarageException {
        if (checkAvailableSpaces(_availableSpaces)) {
            availableSpaces = _availableSpaces;
        } else {
            throw new GarageException("Either more free spaces than there are available spaces or negative available spaces");
        }
    }

    private boolean checkSpaces(int _spaces) {
        return _spaces > 0;
    }

    public void setSpaces(int _spaces) throws GarageException {
        if (checkSpaces(_spaces)) {
            spaces = _spaces;
        } else {
            throw new GarageException("MaxSpaces must be greater than zero");
        }
    }

    public void decFreeCarSpaces() throws GarageException {
        if (availableSpaces > 0) {
            availableSpaces--;
        } else {
            throw new GarageException("No free spaces available");
        }
    }

    public void incFreeCarSpaces() throws GarageException {
        if (availableSpaces < spaces) {
            availableSpaces++;
        } else {
            throw new GarageException("all spaces freee");
        }
    }

    public static int getTotalCarSpaces() {
        return garagenListe.stream().mapToInt(garage -> garage.spaces).sum();
    }

    public static double totalCarSpacesValue() {
        return getTotalCarSpaces() * PRICE;
    }
}
