package vierzehn;

import java.util.HashMap;

public class A {
    private static final int LETTERS_IN_ALPHABET = 26;

    public static void main (String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < args.length; i++) {
            for(int n = 0; n < args[i].length(); n++) {
                map.put(args[i].toLowerCase().charAt(n),
                        map.getOrDefault(args[i].toLowerCase().charAt(n), 0) + 1);
            }
        }

        for(int i = 0; i < LETTERS_IN_ALPHABET; i++) {
            if (map.containsKey((char) (97 + i))) {
                System.out.println((char) (97 + i) + " " + map.get((char) (97 + i)));
            }
        }
    }
}
