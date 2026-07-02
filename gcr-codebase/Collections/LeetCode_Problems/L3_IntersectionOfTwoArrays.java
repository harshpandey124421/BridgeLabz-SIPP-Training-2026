import java.util.*;

public class L3_IntersectionOfTwoArrays {
    static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        HashSet<Integer> resultSet = new HashSet<>();
        for (int n : nums2) {
            if (set1.contains(n)) {
                resultSet.add(n);
            }
        }
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int n : resultSet) {
            result[i++] = n;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
