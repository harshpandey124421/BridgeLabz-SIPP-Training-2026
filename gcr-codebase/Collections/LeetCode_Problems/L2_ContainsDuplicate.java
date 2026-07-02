import java.util.*;

public class L2_ContainsDuplicate {
    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums1));
        System.out.println(containsDuplicate(nums2));
    }
}
