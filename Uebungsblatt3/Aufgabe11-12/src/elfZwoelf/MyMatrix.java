package elfZwoelf;

import java.text.DecimalFormat;
import java.util.Random;

public class MyMatrix {

    public final int rows = 2;

    public final int columns = 3;

    final double[][] matrix = new double[rows][columns];

    public double getEntry(int row, int column) {
        return matrix[row][column];
    }

    public void setEntry(int row, int column, int enter) {
        matrix[row][column] = enter;
    }

    public void randomEntry() {
        double rand;

        for(int i = 0; i < rows; i++) {
            for(int n = 0; n < columns; n++) {
                rand = new Random().nextDouble(2) - 1;
                matrix[i][n] = rand;
            }
        }
    }

    public MyVector mult(MyVector v) {
        MyVector result = new MyVector();

        double enter = 0;

        if(columns != v.length) {
            return null;
        }

        for(int i = 0; i < rows; i++) {
            for(int n = 0; n < columns; n++) {
                enter = enter + (matrix[i][n] * v.getEntry(n));
            }
            result.setEntry(i, enter);
            enter = 0;
        }

        return result;
    }

    public void printMatrix() {
        DecimalFormat df = new DecimalFormat("#.###");

        for(int i = 0; i < rows; i++) {
            for(int n = 0; n < columns; n++) {
                System.out.print(df.format(matrix[i][n]) + " ");
            }
            System.out.println();
        }
    }
}
