package fuenfzehn;

import java.util.ArrayList;
import java.util.Random;

public class ClassMainA {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        IsEven even = new IsEven();
        DoubleAndPrint dap = new DoubleAndPrint();

        for(int i = 0; i < 10; i++ ) {
            int rand = new Random().nextInt(10);
            intList.add(rand);
        }

        intList.removeIf(even);

        for (int i = 0; i < intList.size(); i++) {
            dap.accept(intList.get(i));
        }
    }
}
