package sechzehn;

import java.util.Random;
import java.util.function.Supplier;

public class StringSupplier implements Supplier<String> {
    private final int length;
    private final Random rand;

    public StringSupplier(int length, Random random) {
        this.length = length;
        this.rand = random;
    }

    @Override
    public String get() {
        String ret = "";

        for(int i = 0; i < rand.nextInt(length + 1); i++) {
            ret = ret.concat(String.valueOf((char) (rand.nextInt(95) + 32)));
            //es steht nirgends, dass wir das mit nem StringBuilder machen müssen.
        }
        return ret;
    }
}
