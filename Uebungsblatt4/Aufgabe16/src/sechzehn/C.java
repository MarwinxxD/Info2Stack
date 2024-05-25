package sechzehn;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class C {
    public static void main(String[] args) {
        IntStream intstream = IntStream.rangeClosed(1, 100);

        DoubleStream doubstream = intstream.mapToDouble(x -> x);

        OptionalDouble average = doubstream.average();

        if (average.isPresent()) {
            System.out.println("Der Durchschnitt der Zahlen von 1 bis 100 ist: " + average.getAsDouble());
        } else {
            System.out.println("Kein Rückgabewert für den Average vorhanden.");
        }
    }
}
