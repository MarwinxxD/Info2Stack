package fuenfzehn;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassMainD {
    public static void main(String[] args) {
        String sequence = "!\"#$%&'()*+,-./:;<=>?@[\\]ˆ_`{|}˜";

        ArrayList<String> strList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            strList.add(sc.nextLine());
        }

        strList.removeIf(str ->
                str.chars().anyMatch(chr ->
                        sequence.indexOf(chr) >= 0)
        );

        strList.forEach(System.out::println);
    }
}
