package fuenfzehn;

import java.util.ArrayList;
import java.util.Random;

public class ClassMainB {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++ ) {
            int rand = new Random().nextInt(10);
            intList.add(rand);
        }

        intList.removeIf(x -> x % 2 == 0);

        intList.forEach(x -> System.out.print(x * 2 + "\n"));
    }
}
