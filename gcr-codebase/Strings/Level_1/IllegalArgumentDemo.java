import java.util.Scanner;
public class IllegalArgumentDemo {
    public static void generateException(String text) {
        text.substring(5, 2);
    }
    public static void handleException(String text) {
        try {
            text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
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