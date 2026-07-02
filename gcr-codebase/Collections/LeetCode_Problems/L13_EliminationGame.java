public class L13_EliminationGame {
    static int lastRemaining(int n) {
        boolean leftToRight = true;
        int remaining = n;
        int step = 1;
        int head = 1;
        while (remaining > 1) {
            if (leftToRight || remaining % 2 == 1) {
                head += step;
            }
            remaining /= 2;
            step *= 2;
            leftToRight = !leftToRight;
        }
        return head;
    }

    public static void main(String[] args) {
        System.out.println(lastRemaining(9));
    }
}
