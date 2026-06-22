import java.util.Scanner;
public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        while (original != 0) {
            int digit = original % 10;
            sum += (digit * digit * digit);
            original /= 10;
        }
        if (sum == n) System.out.println("Armstrong Number");
        else System.out.println("Not Armstrong");
        sc.close();
    }
}