// Subtopic: LeetCode 209 - Minimum Size Subarray Sum
public class LCMinSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, windowSum = 0, minLen = Integer.MAX_VALUE;
        for (int end = 0; end < nums.length; end++) {
            windowSum += nums[end];
            while (windowSum >= target) {
                minLen = Math.min(minLen, end - start + 1);
                windowSum -= nums[start];
                start++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}