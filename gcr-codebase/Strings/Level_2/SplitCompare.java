import java.util.Scanner;
public class SplitCompare {
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static String[] customSplit(String text) {
        int len = getLength(text);
        int spaces = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') spaces++;
        }
        int[] spaceIndexes = new int[spaces + 2];
        spaceIndexes[0] = -1;
        int idx = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') spaceIndexes[idx++] = i;
        }
        spaceIndexes[idx] = len;
        String[] words = new String[spaces + 1];
        for (int i = 0; i < words.length; i++) {
            String word = "";
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }
    public static boolean compareArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i])) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] custom = customSplit(text);
        String[] builtIn = text.split(" ");
        System.out.println("Match: " + compareArrays(custom, builtIn));
        sc.close();
    }
}