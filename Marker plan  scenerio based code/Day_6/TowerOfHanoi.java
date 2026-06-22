// Subtopic: Recursion - Tower of Hanoi
public class TowerOfHanoi {
    static int moves = 0;
    
    public static void solveHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            moves++;
            return;
        }
        solveHanoi(n - 1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        moves++;
        solveHanoi(n - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        solveHanoi(3, 'A', 'C', 'B');
        System.out.println("Total moves: " + moves);
    }
}