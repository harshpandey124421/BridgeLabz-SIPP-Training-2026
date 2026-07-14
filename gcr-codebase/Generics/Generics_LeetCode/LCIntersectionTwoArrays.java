// Subtopic: LeetCode 349 - Intersection of Two Arrays
import java.util.HashSet;

public class LCIntersectionTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int n : nums1) set1.add(n);
        
        HashSet<Integer> set2 = new HashSet<>();
        for (int n : nums2) {
            if (set1.contains(n)) {
                set2.add(n);
            }
        }
        
        int[] result = new int[set2.size()];
        int i = 0;
        for (int n : set2) result[i++] = n;
        return result;
    }
}