// Subtopic: LeetCode 2110 - Number of Smooth Descent Periods of a Stock
public class LCSmoothDescentPeriods {
    public long getDescentPeriods(int[] prices) {
        long ans = 1;
        long current = 1;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] == prices[i - 1] - 1) {
                current++;
            } else {
                current = 1;
            }
            ans += current;
        }
        return ans;
    }
}