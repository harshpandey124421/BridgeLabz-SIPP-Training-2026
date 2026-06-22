public class LCReverseInteger {
    public static int reverse(int x) {
        return reverseRec(x, 0);
    }
    private static int reverseRec(int x, int rev) {
        if (x == 0) return rev;
        int pop = x % 10;
        if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
        if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
        return reverseRec(x / 10, rev * 10 + pop);
    }
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}