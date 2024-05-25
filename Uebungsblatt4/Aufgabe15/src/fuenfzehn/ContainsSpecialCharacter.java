package fuenfzehn;

import java.util.function.Predicate;

public class ContainsSpecialCharacter implements Predicate<String> {
    String sequence = "!\"#$%&'()*+,-./:;<=>?@[\\]ˆ_`{|}˜";

    @Override
    public boolean test(String s) {
        for(int i = 0; i < s.length(); i++) {
            if (sequence.indexOf(s.charAt(i)) >= 0) {
                return true;
            }
        }
        return false;
    }
}
