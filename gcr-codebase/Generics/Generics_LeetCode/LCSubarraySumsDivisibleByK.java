// Subtopic: LeetCode 974 - Subarray Sums Divisible by K
import java.util.HashMap;

public class LCSubarraySumsDivisibleByK {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0, sum = 0;
        for (int num : nums) {
            sum = (sum + num) % k;
            if (sum < 0) sum += k;
            count += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}