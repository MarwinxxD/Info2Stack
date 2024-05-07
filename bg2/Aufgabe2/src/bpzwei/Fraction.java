package bpzwei;

import static java.lang.System.exit;

public class Fraction extends Number implements Comparable<Fraction> {

    IntegerNumber numerator = new IntegerNumber();
    IntegerNumber denominator = new IntegerNumber();

    public Fraction(){
        numerator = new IntegerNumber();
        denominator = new IntegerNumber(1);
    }

    public Fraction(int numerator, int denominator){
        this.numerator = new IntegerNumber(numerator);
        if(denominator <= 0) {
            System.exit(0);
        }
        this.denominator = new IntegerNumber(denominator);
    }

    @Override
    public boolean isZero() {
        return numerator.isZero();
    }

    @Override
    public boolean isPositive() {
        return numerator.isPositive();
    }

    @Override
    public String toString() {
        return numerator.toString() + "/" + denominator.toString();
    }

    @Override
    public int compareTo(Fraction o) {
        return this.numerator.compareTo(o.numerator);
    }
}
