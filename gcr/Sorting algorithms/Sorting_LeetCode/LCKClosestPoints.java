// Subtopic: LeetCode 973 - K Closest Points to Origin
import java.util.PriorityQueue;

public class LCKClosestPoints {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1])
        );
        for (int[] point : points) {
            maxHeap.add(point);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        int[][] res = new int[k][2];
        int index = 0;
        while (!maxHeap.isEmpty()) {
            res[index++] = maxHeap.poll();
        }
        return res;
    }
}