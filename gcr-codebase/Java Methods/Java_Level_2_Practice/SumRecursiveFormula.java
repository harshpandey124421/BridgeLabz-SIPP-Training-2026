import java.util.Scanner;
public class SumRecursiveFormula {
    public static int sumRec(int n) {
        if (n <= 1) return n;
        return n + sumRec(n - 1);
    }
    public static int sumForm(int n) { return n * (n + 1) / 2; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) System.out.println(sumRec(n) == sumForm(n));
        sc.close();
    }
}