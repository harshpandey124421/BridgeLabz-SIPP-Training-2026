// Subtopic: LeetCode 315 - Count of Smaller Numbers After Self
import java.util.ArrayList;
import java.util.List;

public class LCCountSmallerNumbers {
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] indices = new int[n];
        for (int i = 0; i < n; i++) indices[i] = i;
        
        mergeSort(nums, indices, result, 0, n - 1);
        
        List<Integer> list = new ArrayList<>();
        for (int r : result) list.add(r);
        return list;
    }
    
    private void mergeSort(int[] nums, int[] indices, int[] result, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(nums, indices, result, left, mid);
        mergeSort(nums, indices, result, mid + 1, right);
        merge(nums, indices, result, left, mid, right);
    }
    
    private void merge(int[] nums, int[] indices, int[] result, int left, int mid, int right) {
        int[] tempIndices = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        int rightCount = 0;
        
        while (i <= mid && j <= right) {
            if (nums[indices[i]] > nums[indices[j]]) {
                rightCount++;
                tempIndices[k++] = indices[j++];
            } else {
                result[indices[i]] += rightCount;
                tempIndices[k++] = indices[i++];
            }
        }
        while (i <= mid) {
            result[indices[i]] += rightCount;
            tempIndices[k++] = indices[i++];
        }
        while (j <= right) {
            tempIndices[k++] = indices[j++];
        }
        for (i = left, k = 0; i <= right; i++, k++) {
            indices[i] = tempIndices[k];
        }
    }
}