public class Main {
	
	static a a = new a();
	static b b = new b();
	static c c = new c();
	static d d = new d();
	static e e = new e();
	
	public static void main(String[] args) {
		a.print(args);
		System.out.println();
		
		b.printConnected(args);
		System.out.println();
		
		c.cCount(args);
		System.out.println();
		
		d.random(args);
		System.out.println();
		
		e.muenze(args);
	}
}
