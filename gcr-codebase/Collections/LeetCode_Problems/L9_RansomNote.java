import java.util.*;

public class L9_RansomNote {
    static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            int count = countMap.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            }
            countMap.put(c, count - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }
}
