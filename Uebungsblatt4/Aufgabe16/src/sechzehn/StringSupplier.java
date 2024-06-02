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
        StringBuilder ret = new StringBuilder();

        for(int i = 0; i < rand.nextInt(length + 1); i++) {
            ret.appendCodePoint(rand.nextInt(95) + 32);
        }
        return ret.toString();
    }
}
