public class Rectangle {

	int höhe;
	int breite;
	
	public Rectangle(int breite, int höhe) {
		this.höhe = höhe;
		this.breite = breite;
	}
	
	public int umfang()
	{
		return this.breite * this.höhe;
	}
	
	public void setHöhe(int h)
	{
		this.höhe = h;
	}
	
	public int getHöhe()
	{
		return this.höhe;
	}
	
	public void setBreite(int b)
	{
		this.breite = b;
	}
	
	public int getBreite()
	{
		return this.breite;
	}
}
