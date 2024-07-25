package Klausurvorbereitung;

public class Parcel extends RealEstate{
	
	private int size;
	
	private void setSize(int size) {
		if (checkSize() == false) {
			throw new IllegalSizeException("Diese Größe passt nicht");
		} else
			this.size = size;
	}

	private int getSize() {
		return size;
	}
	private boolean checkSize() {
		if (getSize()<= 250) {
			return false;
		} else return true;
	}

}
