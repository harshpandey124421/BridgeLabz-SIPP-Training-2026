public class FootballTeamStats {
    public static int sum(int[] arr) { int s = 0; for(int x : arr) s += x; return s; }
    public static double mean(int[] arr) { return (double)sum(arr) / arr.length; }
    public static int min(int[] arr) { int m = arr[0]; for(int x : arr) m = Math.min(m, x); return m; }
    public static int max(int[] arr) { int m = arr[0]; for(int x : arr) m = Math.max(m, x); return m; }
    public static void main(String[] args) {
        int[] h = new int[11];
        for(int i=0; i<11; i++) h[i] = (int)(Math.random() * 101) + 150;
        System.out.println(min(h) + " " + max(h) + " " + mean(h));
    }
}