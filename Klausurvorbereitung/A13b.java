package Klausurvorbereitung;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class A13b {

	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<>();

		list.add("Polymorphismus");
		list.add(new String("spätes Binden"));
		list.add(LocalDate.now());
		list.add(new Random());
		list.add(new Scanner(System.in));

		Iterator<Object> it = list.iterator();
		
		//list.iterator(getClass(LocalDate.now()));
		
		while (it.hasNext()) {
			Object bext = it.next();
			
			if (bext.getClass().equals(LocalDate.class)) {
				LocalDate lo = (LocalDate)bext;
				System.out.println((lo.minusMonths(2)));
			}  else if(bext instanceof CharSequence) {
				CharSequence sq = (CharSequence) bext;
				System.out.println(	sq.charAt(0) + sq.charAt(sq.length()-1));
			} else {
				System.out.print(bext);
			}
		} for (Object o: list) {
			System.out.println(o);
		}
	}

}
