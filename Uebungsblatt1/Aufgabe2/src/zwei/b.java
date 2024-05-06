package zwei;

public class b {
	public void printConnected(String[] args)
	{
		String erg = null;
		for (int i = 0; i < args.length; i++) {
			erg = erg.concat(args[i]);
		}
		System.out.println(erg);
	}
}
