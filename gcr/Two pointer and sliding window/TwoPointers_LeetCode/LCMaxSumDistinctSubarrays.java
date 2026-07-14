// Subtopic: LeetCode 2461 - Maximum Sum of Distinct Subarrays With Length K
import java.util.HashSet;
import java.util.Set;

public class LCMaxSumDistinctSubarrays {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0, currentSum = 0;
        int start = 0;
        Set<Integer> window = new HashSet<>();
        
        for (int end = 0; end < nums.length; end++) {
            while (window.contains(nums[end])) {
                window.remove(nums[start]);
                currentSum -= nums[start];
                start++;
            }
            window.add(nums[end]);
            currentSum += nums[end];
            
            if (end - start + 1 > k) {
                window.remove(nums[start]);
                currentSum -= nums[start];
                start++;
            }
            if (end - start + 1 == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
}