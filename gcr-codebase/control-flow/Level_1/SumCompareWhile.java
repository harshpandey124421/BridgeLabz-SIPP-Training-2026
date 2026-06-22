import java.util.Scanner;
public class SumCompareWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int formulaSum = n * (n + 1) / 2;
            int whileSum = 0;
            int counter = 1;
            while (counter <= n) {
                whileSum += counter;
                counter++;
            }
            System.out.println("Formula Sum: " + formulaSum);
            System.out.println("While Loop Sum: " + whileSum);
            System.out.println("Results match: " + (formulaSum == whileSum));
        }
        sc.close();
    }
}