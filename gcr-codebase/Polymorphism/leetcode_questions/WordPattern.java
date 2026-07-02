import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] tokens = s.split(" ");
        if (tokens.length != pattern.length()) {
            return false;
        }
        HashMap<Character, String> charMap = new HashMap<>();
        HashMap<String, Character> wordMap = new HashMap<>();
        for (int i = 0; i < tokens.length; i++) {
            char ch = pattern.charAt(i);
            String word = tokens[i];
            if (charMap.containsKey(ch)) {
                if (!charMap.get(ch).equals(word)) {
                    return false;
                }
            } else {
                charMap.put(ch, word);
            }
            if (wordMap.containsKey(word)) {
                if (wordMap.get(word) != ch) {
                    return false;
                }
            } else {
                wordMap.put(word, ch);
            }
        }
        return true;
    }
}