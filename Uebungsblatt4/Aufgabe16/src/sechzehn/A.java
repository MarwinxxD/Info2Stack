package sechzehn;

import java.util.Random;
import java.util.stream.IntStream;

public class A {
    public static void main(String[] args) {
        Random rand = new Random();

        IntStream randstream = rand.ints(0, 10)
                                    .limit(10);
        randstream = randstream.filter(x -> x % 3 == 0);

        randstream.forEach(System.out::println);
    }
}
