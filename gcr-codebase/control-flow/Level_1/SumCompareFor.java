import java.util.Scanner;
public class SumCompareFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int formulaSum = n * (n + 1) / 2;
            int forSum = 0;
            for (int i = 1; i <= n; i++) {
                forSum += i;
            }
            System.out.println("Formula Sum: " + formulaSum);
            System.out.println("For Loop Sum: " + forSum);
            System.out.println("Results match: " + (formulaSum == forSum));
        }
        sc.close();
    }
}