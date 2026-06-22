import java.util.Scanner;
public class TowerOfHanoi {
    public static void solve(int n, char source, char destination, char auxiliary) {
        if (n == 0) return;
        solve(n - 1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        solve(n - 1, auxiliary, destination, source);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc.nextInt(), 'A', 'C', 'B');
        sc.close();
    }
}