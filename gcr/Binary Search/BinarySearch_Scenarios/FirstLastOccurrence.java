// Subtopic: Binary Search - Find the First and Last Occurrence of an Element
public class FirstLastOccurrence {
    public static int[] findOccurrences(int[] arr, int target) {
        int[] result = {-1, -1};
        result[0] = findBound(arr, target, true);
        if (result[0] != -1) {
            result[1] = findBound(arr, target, false);
        }
        return result;
    }
    
    private static int findBound(int[] arr, int target, boolean isFirst) {
        int left = 0;
        int right = arr.length - 1;
        int bound = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                bound = mid;
                if (isFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return bound;
    }
}