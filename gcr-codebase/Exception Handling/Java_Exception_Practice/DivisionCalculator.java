import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled: Division by zero");
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException handled: Non-numeric value entered");
        }
        sc.close();
    }
}