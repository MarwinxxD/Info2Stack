import java.util.Scanner;

public class d {
	public int summ(String s)
	{
		Scanner scan = new Scanner(s);
		int sum = 0;
		while(scan.hasNextInt()) {
			sum = sum + scan.nextInt();
		}
		scan.close();
		return sum;
	}
}
