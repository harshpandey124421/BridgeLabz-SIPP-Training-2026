import java.util.Scanner;
public class Quadratic {
    public static double[] findRoots(double a, double b, double c) {
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d > 0) return new double[]{(-b + Math.sqrt(d)) / (2 * a), (-b - Math.sqrt(d)) / (2 * a)};
        if (d == 0) return new double[]{-b / (2 * a)};
        return new double[]{};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] r = findRoots(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        for (double v : r) System.out.println(v);
        sc.close();
    }
}