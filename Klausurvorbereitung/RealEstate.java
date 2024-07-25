package Klausurvorbereitung;

public class RealEstate {

	public int price;
	public final double fee = 0.0345;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (checkPrice()== false ) {
			throw new IllegalPriceException("Das ist zu wenig Geld oder es ist keine schöne Zahl");
		}
		this.price = price;
	}
	
	public boolean checkPrice() {
		if (getPrice()<= 10.000 && getPrice()%1000!=0) {
			return false;
		}else return true;
	}
	
	
	
	public double berchnen() {
		return (fee*getPrice())+getPrice();
	}
}