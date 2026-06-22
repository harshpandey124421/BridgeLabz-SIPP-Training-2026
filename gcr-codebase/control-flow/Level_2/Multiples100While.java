import java.util.Scanner;
public class Multiples100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0 && n < 100) {
            int counter = 100;
            while (counter >= 1) {
                if (counter % n == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }
        sc.close();
    }
}