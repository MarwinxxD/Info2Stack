package sechzehn;

import java.util.Random;
import java.util.stream.DoubleStream;

public class B {
    public static void main(String[] args) {
        Random rand = new Random();

        DoubleStream randstream = rand.doubles(0, 1)
                                        .map(x -> x = x * 2)
                                        .limit(10);

        System.out.println(randstream.sum());
    }
}
