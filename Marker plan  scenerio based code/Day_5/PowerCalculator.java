// Subtopic: Methods - Power calculation
public class PowerCalculator {
    public static double power(double base, int exp) {
        double result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(2.0, 3));
    }
}