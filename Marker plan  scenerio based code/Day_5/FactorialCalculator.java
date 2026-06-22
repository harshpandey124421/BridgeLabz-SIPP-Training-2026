// Subtopic: Methods - Method Overloading (Factorial)
public class FactorialCalculator {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static double factorial(double n) {
        double fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(5.0));
    }
}