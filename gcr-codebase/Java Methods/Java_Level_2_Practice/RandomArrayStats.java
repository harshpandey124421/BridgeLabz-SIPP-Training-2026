public class RandomArrayStats {
    public static int[] gen() {
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) a[i] = (int)(Math.random() * 9000) + 1000;
        return a;
    }
    public static double[] stats(int[] a) {
        double sum = 0; int min = a[0], max = a[0];
        for (int x : a) { sum += x; min = Math.min(min, x); max = Math.max(max, x); }
        return new double[]{sum / a.length, min, max};
    }
    public static void main(String[] args) {
        double[] r = stats(gen());
        System.out.println(r[0] + " " + r[1] + " " + r[2]);
    }
}