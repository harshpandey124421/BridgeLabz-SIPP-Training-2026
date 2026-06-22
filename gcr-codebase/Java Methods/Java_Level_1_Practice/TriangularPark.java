import java.util.Scanner;
public class TriangularPark {
    public static int computeRounds(double s1, double s2, double s3) {
        return (int) Math.ceil(5000 / (s1 + s2 + s3));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(computeRounds(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        sc.close();
    }
}