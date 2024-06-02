package dreizehn;

import java.util.HashSet;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

public class A {
    static Collection<Integer> firstCollection = new LinkedList<>();

    static Collection<Object> secondCollection = new HashSet<>();


    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Integer rand = new Random().nextInt(10);

            firstCollection.add(rand);
        }

        for (int i = 0; i < 20; i++) {
            Integer rand = new Random().nextInt(10);

            secondCollection.add(rand);
        }

        if (secondCollection.containsAll(firstCollection)) {
            System.out.println("secondCollection enthaelt alle Elemente von firstCollection");
        } else {
            System.out.println("secondCollection enthaelt nicht alle Elemente von firstCollection");
        }
    }


}
