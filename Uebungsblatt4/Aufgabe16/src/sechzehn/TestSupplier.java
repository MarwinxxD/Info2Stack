package sechzehn;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestSupplier {
    public static void main(String[] args) {
        StringSupplier sup = new StringSupplier(10, new Random());

        Stream<String> result = Stream.generate(sup)
                .filter(s -> !s.isEmpty())
                .map(s -> s + ", ")
                .limit(10)
                .collect(Collectors.joining()).lines();

        result.forEach(System.out::println);
    }
}
