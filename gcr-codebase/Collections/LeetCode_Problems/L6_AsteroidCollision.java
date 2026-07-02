import java.util.*;

public class L6_AsteroidCollision {
    static int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int a : asteroids) {
            boolean alive = true;
            while (alive && a < 0 && !stack.isEmpty() && stack.peek() > 0) {
                int top = stack.peek();
                if (top < -a) {
                    stack.pop();
                } else if (top == -a) {
                    stack.pop();
                    alive = false;
                } else {
                    alive = false;
                }
            }
            if (alive) {
                stack.push(a);
            }
        }
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] asteroids = {5, 10, -5};
        int[] result = asteroidCollision(asteroids);
        System.out.println(Arrays.toString(result));
    }
}
