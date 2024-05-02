package sieben;

public class Main {

    static sieben.a a = new a();
    static sieben.b b = new b();

    public static void main(String[] args) {
        System.out.println(a.deleteFromString(new StringBuilder("Eine bunte Kuh"), new StringBuilder(" "), 4));
        b.doAllTheStuffInB();
    }
}
