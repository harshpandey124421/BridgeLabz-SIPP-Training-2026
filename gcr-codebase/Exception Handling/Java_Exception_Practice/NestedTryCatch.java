import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {100, 200, 300};
        
        try {
            int index = sc.nextInt();
            try {
                int divisor = sc.nextInt();
                int result = arr[index] / divisor;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
        sc.close();
    }
}