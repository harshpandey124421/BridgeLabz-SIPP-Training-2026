import java.util.Scanner;
public class VowelConsonantType {
    public static String checkCharType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c < 'a' || c > 'z') return "Not a Letter";
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return "Vowel";
        return "Consonant";
    }
    public static String[][] getTypesArray(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkCharType(text.charAt(i));
        }
        return result;
    }
    public static void displayTypes(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Char: " + data[i][0] + " | Type: " + data[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] data = getTypesArray(text);
        displayTypes(data);
        sc.close();
    }
}