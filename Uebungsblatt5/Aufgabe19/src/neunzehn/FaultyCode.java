package neunzehn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FaultyCode {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add("Test");

        try {
            System.out.println(list.get(-1));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(Integer.parseInt(list.get(0)));
        } catch (Exception e) {
            e.printStackTrace();
        }

        String s1 = "abc";
        Scanner myScanner = new Scanner(s1);

        try {
            int x = myScanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String s2 = null;
        String s3 = null;
        s2 = myScanner.next();

        try {
            s3 = myScanner.next();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(s2.toLowerCase() + " " + s3.toUpperCase());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
