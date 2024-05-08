package bpzwei;

public class Fraction extends Number implements Comparable<Fraction> {

    IntegerNumber numerator;
    IntegerNumber denominator;

    public Fraction(){
        numerator = new IntegerNumber();
        denominator = new IntegerNumber(1);
    }

    public Fraction(IntegerNumber numerator, IntegerNumber denominator){
        this.numerator = numerator;
        if(!(denominator.isPositive())) {
            System.exit(0);
        }
        this.denominator = denominator;
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
        if (this.denominator.compareTo(o.denominator) == 0) {
            return this.numerator.compareTo(o.numerator);
        }

        Fraction f1 = new Fraction(this.numerator.times(o.denominator), this.denominator.times(o.denominator));
        Fraction f2 = new Fraction(o.numerator.times(this.denominator), o.denominator.times(this.denominator));
        return f1.numerator.compareTo(f2.numerator);
    }

    public Fraction inverse(Fraction f) {
        Fraction _f = new Fraction();

        if(f.numerator.isZero()) {
            System.out.println("Wenn du das tust stirbt eine Katze");
            System.exit(0);
        }

        _f.numerator = this.denominator;

        _f.denominator = f.numerator;

        return _f;

        //statt Fraction return boolean return für Überprüfung in main?
    }
}
