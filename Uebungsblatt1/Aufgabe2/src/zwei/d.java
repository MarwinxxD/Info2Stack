package zwei;

import java.util.Random;

public class d {
	public void random(String[] args)
	{
		int rand = new Random().nextInt(args.length);
		
		if(args.length == 0) {
			System.out.println("ERROR!");
		} else {
			System.out.println(args[rand]);
		}
	}
}
