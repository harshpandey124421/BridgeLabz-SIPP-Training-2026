import java.util.Scanner;
public class StringIndexBoundsDemo {
    public static void generateException(String text) {
        text.charAt(text.length() + 5);
    }
    public static void handleException(String text) {
        try {
            text.charAt(text.length() + 5);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        handleException(text);
        generateException(text);
        sc.close();
    }
}