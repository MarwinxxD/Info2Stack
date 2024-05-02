package b;

import java.util.Scanner;

public class b6 {
	public String scan()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("schreib was");
		String input = scan.nextLine();
		scan.close();
		return input;
	}
}
