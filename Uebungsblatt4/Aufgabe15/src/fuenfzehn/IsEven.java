package fuenfzehn;

import java.util.function.Predicate;

public class IsEven implements Predicate<Integer> {
    @Override
    public boolean test(Integer value) {
        return value % 2 == 0;
    }
}
