package neunzehn;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Rechner {
    double x;
    double y;
    char operator;

    Pattern p = Pattern.compile("[\\x2B\\x2D\\x2A\\x2F]");

    public void setX(String x) throws NumberFormatException {
        try {
            this.x = Double.parseDouble(x);
        } catch (Exception e) {
            throw new NumberFormatException("First Number is faulty");
        }
    }

    public void setY(String y) throws NumberFormatException {
        try {
            this.y  = Double.parseDouble(y);
        } catch (Exception e) {
            throw new NumberFormatException("Second Number is faulty");
        }
    }

    public void setOperator(String operator) throws IllegalArgumentException {
        if (operator.length() < 2 &&
                (operator.charAt(0) == '+' || operator.charAt(0) == '-'
                        || operator.charAt(0) == '*' || operator.charAt(0) == '/')) {
            this.operator = operator.charAt(0);
        } else {
            throw new IllegalArgumentException("Der Operator ist nicht Valide");
        }
    }

    public void rechnen () {
        if(operator == '+') {
            System.out.println("= " + x + y);
        } else if (operator == '-') {
            System.out.println("= " +  - y);
        } else if (operator == '*') {
            System.out.println("= " + x * y);
        }
        System.out.println("= " + x / y);
    }
}
