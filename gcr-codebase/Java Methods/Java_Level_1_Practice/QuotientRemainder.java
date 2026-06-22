import java.util.Scanner;
public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int num, int div) {
        return new int[]{num / div, num % div};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] res = findRemainderAndQuotient(sc.nextInt(), sc.nextInt());
        System.out.println(res[0] + " " + res[1]);
        sc.close();
    }
}