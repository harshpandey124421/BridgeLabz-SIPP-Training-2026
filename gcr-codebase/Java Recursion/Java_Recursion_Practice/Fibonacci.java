import java.util.Scanner;
public class Fibonacci {
    public static int getFibonacci(int n) {
        if (n <= 1) return n;
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getFibonacci(sc.nextInt()));
        sc.close();
    }
}