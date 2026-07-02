import java.util.*;

public class L5_FirstUniqueEvenElement {
    static int firstUniqueEven(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int n : nums) {
            if (n % 2 == 0) {
                countMap.put(n, countMap.getOrDefault(n, 0) + 1);
            }
        }
        for (int n : nums) {
            if (n % 2 == 0 && countMap.get(n) == 1) {
                return n;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2, 6};
        System.out.println(firstUniqueEven(nums));
    }
}
