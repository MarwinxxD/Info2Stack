package fuenfzehn;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassMainC {
    public static void main(String[] args) {
        ContainsSpecialCharacter csc = new ContainsSpecialCharacter();

        ArrayList<String> strList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            strList.add(sc.nextLine());
        }

        strList.removeIf(csc);

        strList.forEach(System.out::println);
    }
}
