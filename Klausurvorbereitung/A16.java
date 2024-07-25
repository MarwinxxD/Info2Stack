package Klausurvorbereitung;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.function.Supplier;

public class A16 {

	public static void main(String[] args) {

		Random rndm = new Random();

		IntStream in = rndm.ints(0, 10);

		in.filter(p -> p % 3 == 0).limit(10).forEach(System.out::print);

		DoubleStream ds = rndm.doubles(0, 1);

		ds.limit(10).forEach(p -> System.out.println(p * 2));

		Stream<String> s = Stream.generate(new StrinSupplier(20));

	}

}

public class StringSupplier implements Supplier<String> {
	private final int maxLength;
	private final Random rng = new Random();

	public StringSupplier(int maxLength) {
		this.maxLength = maxLength;
	}

	@Override
	public String get() {
		int length = rng.nextInt(this.maxLength + 1);
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < length; i++) {
		}
	}
}