package bpzwei;

public class IntegerNumber extends Number implements Comparable<IntegerNumber> {
    private final int number;

    public IntegerNumber() {
        this.number = 0;
    }

    public IntegerNumber(int number) {
        this.number = number;
    }

    public boolean isEqual(IntegerNumber other) {
        return this.number == other.number;
    }

    public IntegerNumber times(IntegerNumber factor) {
        return new IntegerNumber(this.number * factor.number);
    }

    @Override
    public boolean isZero() {
        return number == 0;
    }

    @Override
    public boolean isPositive() {
        return number > 0;
    }

     @Override
    public String toString() {
        return Integer.toString(number);
    }

    @Override
    public int compareTo(IntegerNumber o) {
        return Integer.compare(number, o.number);
    }
}
