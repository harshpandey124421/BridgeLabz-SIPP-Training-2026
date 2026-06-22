import java.util.Scanner;
public class SplitWordsLength {
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
    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = customSplit(text);
        String[][] wordData = getWordLengths(words);
        for (int i = 0; i < wordData.length; i++) {
            System.out.println("Word: " + wordData[i][0] + " | Length: " + Integer.parseInt(wordData[i][1]));
        }
        sc.close();
    }
}