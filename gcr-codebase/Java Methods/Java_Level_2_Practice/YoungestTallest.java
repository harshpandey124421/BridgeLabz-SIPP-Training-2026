import java.util.Scanner;
public class YoungestTallest {
    public static int getYoungest(int[] a) { return Math.min(a[0], Math.min(a[1], a[2])); }
    public static int getTallest(int[] h) { return Math.max(h[0], Math.max(h[1], h[2])); }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int[] height = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        System.out.println(getYoungest(age) + " " + getTallest(height));
        sc.close();
    }
}