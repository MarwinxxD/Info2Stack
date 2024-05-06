package elfZwoelf;

public class Main {
    static MyVector v1 = new MyVector();
    static MyVector v2 = new MyVector();

    static MyMatrix matrix = new MyMatrix();

    public static void main(String[] args) {
        System.out.println("der Vector v1 ist:");
        v1.randomEntry();
        v1.printVector();
        System.out.println("der Vector v1 genormt ist:");
        System.out.println(v1.getNorm());

        System.out.println();
        System.out.println("der Vector v2 ist:");
        v2.randomEntry();
        v2.printVector();
        System.out.println("der Vector v2 genormt ist:");
        System.out.println(v2.getNorm());

        System.out.println();
        if(v1.compareTo(v2) > 0) {
            System.out.println("v1 ist groesser als v2");
        } else if(v1.compareTo(v2) < 0) {
            System.out.println("v1 ist kleiner als v2");
        } else {
            System.out.println("v1 und v2 sind gleich groess");
        }

        System.out.println();
        System.out.println();
        System.out.println("die Matrix ist:");
        matrix.randomEntry();
        matrix.printMatrix();
        System.out.println();
        System.out.println("die Matrix multipliziert mit v1 ist:");
        matrix.mult(v1).printVector();
        System.out.println();
        System.out.println("die Matrix multipliziert mit v2 ist:");
        matrix.mult(v2).printVector();
    }
}
