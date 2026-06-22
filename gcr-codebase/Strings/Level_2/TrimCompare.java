import java.util.Scanner;
public class TrimCompare {
    public static int[] getTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }
    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) result += text.charAt(i);
        return result;
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] bounds = getTrimIndexes(text);
        String customTrim = customSubstring(text, bounds[0], bounds[1]);
        String builtInTrim = text.trim();
        System.out.println("Match: " + compareStrings(customTrim, builtInTrim));
        sc.close();
    }
}