package elfZwoelf;

import java.text.DecimalFormat;
import java.util.Random;

public class MyVector implements Comparable<MyVector> {

    public final int length = 3;

    final double[] entries = new double[length];

    public double getEntry(int i) {
        return entries[i];
    }

    public void setEntry(int i, double enter) {
        entries[i] = enter;
    }

    public void randomEntry() {
        double rand;

        for(int i = 0; i < length; i++) {
            rand = new Random().nextDouble(2) - 1;
            entries[i] = rand;
        }
    }

    public double getNorm() {
        double norm = 0;

        for(int i = 0; i < length; i++) {
            norm = norm + Math.pow(entries[i], 2);
        }

        return Math.sqrt(norm);
    }

    @Override
    public int compareTo(MyVector o) {
        return Double.compare(this.getNorm(), o.getNorm());
    }

    public void printVector() {
        DecimalFormat df = new DecimalFormat("#.###");

        for(int i = 0; i < length; i++) {
            System.out.println(df.format(entries[i]));
        }
    }
}