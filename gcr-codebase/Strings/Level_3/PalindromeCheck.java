import java.util.Scanner;
public class PalindromeCheck {
    public static boolean logic1Loop(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }
    public static boolean logic2Recursion(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return logic2Recursion(text, start + 1, end - 1);
    }
    public static char[] reverseArray(String text) {
        char[] rev = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            rev[i] = text.charAt(text.length() - 1 - i);
        }
        return rev;
    }
    public static boolean logic3Array(String text) {
        char[] orig = text.toCharArray();
        char[] rev = reverseArray(text);
        for (int i = 0; i < orig.length; i++) {
            if (orig[i] != rev[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        System.out.println("Logic 1: " + logic1Loop(text));
        System.out.println("Logic 2: " + logic2Recursion(text, 0, text.length() - 1));
        System.out.println("Logic 3: " + logic3Array(text));
        sc.close();
    }
}