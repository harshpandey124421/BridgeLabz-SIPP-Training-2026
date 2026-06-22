import java.util.Scanner;
public class ArrayIndexBoundsDemo {
    public static void generateException(String[] arr) {
        String name = arr[arr.length + 2];
    }
    public static void handleException(String[] arr) {
        try {
            String name = arr[arr.length + 2];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        for(int i=0; i<3; i++) names[i] = sc.next();
        handleException(names);
        generateException(names);
        sc.close();
    }
}