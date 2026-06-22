import java.util.Scanner;
public class TrigonometryCalculator {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double r = Math.toRadians(angle);
        return new double[]{Math.sin(r), Math.cos(r), Math.tan(r)};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] res = calculateTrigonometricFunctions(sc.nextDouble());
        System.out.println(res[0] + " " + res[1] + " " + res[2]);
        sc.close();
    }
}