import java.util.Scanner;
public class ChocolateDivision {
    public static int[] divideChocolates(int choc, int child) {
        return new int[]{choc / child, choc % child};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] res = divideChocolates(sc.nextInt(), sc.nextInt());
        System.out.println(res[0] + " " + res[1]);
        sc.close();
    }
}