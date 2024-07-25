package Klausurvorbereitung;

public class Apartment extends RealEstate{

	private int size;

	private void setSize(int size) {
		if (checkSize() == false) {
			throw new IllegalSizeException();
		} else
			this.size = size;

	}

	private int getSize() {
		return size;
	}

	private boolean checkSize() {
		if (getSize() <= 20 && getSize() >= 120) {
			return false;
		} else
			return true;
	}

}
