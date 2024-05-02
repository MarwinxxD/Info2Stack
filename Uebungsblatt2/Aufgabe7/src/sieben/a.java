package sieben;

public class a {
    public StringBuilder deleteFromString(StringBuilder text, StringBuilder key, int delete) {
        String temp = null;
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == key.charAt(0)) {
                temp = text.substring(0, i);
                if(i + delete + 1 <= text.length()) {
                    text = new StringBuilder(temp + text.substring(i + delete + 1, text.length()));
                } else {
                    text = new StringBuilder(temp);
                }
            }
        }
        return text;
    }
}
