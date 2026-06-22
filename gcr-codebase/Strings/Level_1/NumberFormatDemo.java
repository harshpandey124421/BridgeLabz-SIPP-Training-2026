import java.util.Scanner;
public class NumberFormatDemo {
    public static void generateException(String text) {
        Integer.parseInt(text);
    }
    public static void handleException(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
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