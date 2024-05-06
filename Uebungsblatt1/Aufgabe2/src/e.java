import java.util.Random;

public class e {
	public void muenze(String[] args)
	{
		boolean muenze = new Random().nextBoolean();
		
		int count = 0;
		while (muenze) {
			System.out.println(args[count]);
			count++;
			muenze = new Random().nextBoolean();
		}
	}
}
