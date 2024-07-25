package Klausurvorbereitung;

public class Luggage {

	private String FlugID;
	private String Besitzer;
	private double Gewicht;

	public void setFlugID(String ID) {
		this.FlugID = ID;
	}

	public void setBesitzer(String Besitzer) {
		if (checkBesitzer()== false) {
			throw new IllegalArgumentException ("Es existiert kein Name");
		} else this.Besitzer = Besitzer;
	}

	public void setGewicht(double Gewicht) {
		if (checkGewicht () ==false) {
			throw new IllegalArgumentException ("weniger als nicht geht das wirklich ?") ;
		} else this.Gewicht = Gewicht;
	}

	public String getFlugID() {
		return FlugID;
	}

	public String getBesitzer() {
		return Besitzer;
	}

	public double getGewicht() {
		return Gewicht;
	}

	public Luggage(String FlugID, String Besitzer, double Gewicht) {

		setFlugID(FlugID);
		setBesitzer(Besitzer);
		setGewicht(Gewicht);

	}

	public boolean checkBesitzer() {
		if (getBesitzer() == null) {
			return false;
		} else return true;
	}
	
	public boolean checkGewicht () {
		if (getGewicht() <= 0) {
			return false;
		} else return true;
	}
	
	@Override 
	public int hashCode() {
		return  Object.hash(getFlugID()+ getBesitzer());
		
	}
}
