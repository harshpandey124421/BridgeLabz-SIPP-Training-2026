// Subtopic: LeetCode 413 - Arithmetic Slices
public class LCArithmeticSlices {
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0;
        int sum = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                count++;
                sum += count;
            } else {
                count = 0;
            }
        }
        return sum;
    }
}