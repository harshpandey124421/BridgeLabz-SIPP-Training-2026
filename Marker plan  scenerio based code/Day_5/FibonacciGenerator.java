// Subtopic: Methods - Iterative Fibonacci
public class FibonacciGenerator {
    public static void fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        fibonacci(7);
    }
}