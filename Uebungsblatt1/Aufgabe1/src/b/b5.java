package b;

public class b5 {
	public StringBuilder fill()
	{
		StringBuilder inf = new StringBuilder("Informatik");
		
		int i;
		
		for(i = 0; i < inf.length(); i++) {
			if(i % 3 == 0) {
				inf = inf.insert(i, 'a');
				i++;
			}
		}
		if(i % 3 == 0) {
			inf = inf.insert(i, 'a');
		}
		
		return inf;
	}
}
