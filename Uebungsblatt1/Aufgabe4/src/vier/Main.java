package vier;

public class Main {
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(10, 2);
		
		Rectangle r2 = new Rectangle(5, 5);
		
		r1.setHöhe(r1.getHöhe() + 1);
		
		r2.setBreite(r2.getBreite() * 2);
		
		if (r1.umfang() > r2.umfang()) {
			System.out.println("Der Umfang von r1 ist größer, als der von r2");
		} else if (r2.umfang() > r1.umfang()) {
			System.out.println("Der Umfang von r2 ist größer, als der von r1");
		} else {
			System.out.println("Der Umfang von r1 und r2 ist gleich groß");
		}
	}
}
