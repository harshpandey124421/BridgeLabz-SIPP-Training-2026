import java.util.Scanner;
public class ShortestLongestWord {
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) { text.charAt(count); count++; }
        } catch (Exception e) { return count; }
    }
    public static String[] customSplit(String text) {
        String[] temp = text.split(" ");
        return temp; 
    }
    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }
    public static int[] findShortestLongest(String[][] data) {
        int minIdx = 0, maxIdx = 0;
        int minLen = Integer.parseInt(data[0][1]);
        int maxLen = minLen;
        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            if (len < minLen) { minLen = len; minIdx = i; }
            if (len > maxLen) { maxLen = len; maxIdx = i; }
        }
        return new int[]{minIdx, maxIdx};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = customSplit(text);
        String[][] wordData = getWordLengths(words);
        int[] indexes = findShortestLongest(wordData);
        System.out.println("Shortest: " + wordData[indexes[0]][0]);
        System.out.println("Longest: " + wordData[indexes[1]][0]);
        sc.close();
    }
}