public class NumberChecker {
    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for(int i=0; i<s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }
    public static boolean isDuck(int[] d) {
        for(int x : d) if(x == 0) return true;
        return false;
    }
    public static boolean isArmstrong(int n, int[] d) {
        int s = 0;
        for(int x : d) s += Math.pow(x, d.length);
        return s == n;
    }
    public static boolean isHarshad(int n, int[] d) {
        int s = 0; for(int x : d) s += x;
        return n % s == 0;
    }
    public static boolean isPalindrome(int[] d) {
        for(int i=0; i<d.length/2; i++) if(d[i] != d[d.length-1-i]) return false;
        return true;
    }
    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i=2; i*i<=n; i++) if(n % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        int num = 153;
        System.out.println(isArmstrong(num, getDigits(num)));
    }
}