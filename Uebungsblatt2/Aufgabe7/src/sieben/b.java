package sieben;

public class b {
    StringBuilder str1 = new StringBuilder("abc");
    StringBuilder str2 = new StringBuilder("a" + "bc");

    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder("abc");

    public void doAllTheStuffInB() {
        String str3 = null;

        sb1.append("ab");
        sb1.append("acht.zwei.drei.c");

        System.out.println("str1: " + str1 + " str2: " + str2 + " sb1: " + sb1 + " sb2: " + sb2);

        str3 = str1.toString().concat("test");

        System.out.println("str1: " + str1 + " str2: " + str2 + " str3: " + str3 + " sb1: " + sb1 + " sb2: " + sb2);

        if(str1.equals(str2)) {
            System.out.println("str1 ist gleich zu str2");
        } else {
            System.out.println("str1 ist ungleich zu str2");
        }

        if(sb1.equals(sb2)) {
            System.out.println("sb1 ist gleich zu sb2");
        } else {
            System.out.println("sb1 ist gleich zu sb2");
        }
    }
}