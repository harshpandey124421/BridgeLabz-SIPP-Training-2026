import java.util.Scanner;
public class FactorsAnalyzer {
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[index++] = i;
        return factors;
    }
    public static int sum(int[] arr) { int s = 0; for (int x : arr) s += x; return s; }
    public static int product(int[] arr) { int p = 1; for (int x : arr) p *= x; return p; }
    public static int sumSquare(int[] arr) { int s = 0; for (int x : arr) s += Math.pow(x, 2); return s; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] f = findFactors(sc.nextInt());
        System.out.println(sum(f) + " " + product(f) + " " + sumSquare(f));
        sc.close();
    }
}