public class c {
	public void cCount(String[] args)
	{
		int count = 0;
		
		for (int i = 0; i < args.length; i++) {
			for (int n = 0; n < args[i].length(); n++) {
				if (args[i].charAt(n) == 'c') {
					count++;
				}
			}
		}
		
		System.out.println("Anzahl der c's = " + count);
	}
}
