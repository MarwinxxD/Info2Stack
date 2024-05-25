package fuenfzehn;

import java.util.function.Consumer;

public class DoubleAndPrint implements Consumer<Integer> {
    @Override
    public void accept(Integer value) {
        System.out.println(value * 2);
    }
}
