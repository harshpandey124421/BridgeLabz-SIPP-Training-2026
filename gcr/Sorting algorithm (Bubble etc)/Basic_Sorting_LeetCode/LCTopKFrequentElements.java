// Subtopic: LeetCode 347 - Top K Frequent Elements
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LCTopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> count.get(a) - count.get(b)
        );
        
        for (int num : count.keySet()) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }
        return result;
    }
}