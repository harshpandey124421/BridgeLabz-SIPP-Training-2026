// Subtopic: Methods - GCD and LCM
public class GcdLcmCalculator {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(12, 15));
        System.out.println(lcm(12, 15));
    }
}