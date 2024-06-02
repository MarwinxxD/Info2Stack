package dreizehn;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        String a = "Polymorphismus";
        StringBuilder b = new StringBuilder("spätes Binden");
        LocalDate c = LocalDate.now();
        Random d = new Random();
        Scanner e = new Scanner(System.in);
        ArrayList<Object> poly = new ArrayList<>();

        poly.add(a);
        poly.add(b);
        poly.add(c);
        poly.add(d);
        poly.add(e);

        Iterator<Object> it = poly.iterator();

        while(it.hasNext()) {
            Object o = it.next();
            if(o.getClass() == LocalDate.class) {
                System.out.println(((LocalDate) o).minusWeeks(2));
            } else if (o instanceof CharSequence oo) {
                 System.out.println((oo.charAt(0) + "" +  (oo.charAt((oo.length() - 1)))));
            } else {
                System.out.println(o);
            }
        }
    }

    //Scanner und Random unterscheiden sich darin, dass Random nur java.util.Random@ und ein Nummer printed,
    //während Scanner noch eine einige Eingenschaften, wie eine aktuelle Position, einen delimited, usw. printed


}
