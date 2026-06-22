// Subtopic: Recursion - Binary Search
public class RecursiveBinarySearch {
    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) return -1;
        
        int mid = left + (right - left) / 2;
        
        if (arr[mid] == target) return mid;
        if (arr[mid] > target) return binarySearch(arr, target, left, mid - 1);
        return binarySearch(arr, target, mid + 1, right);
    }

    public static void main(String[] args) {
        int[] prices = {10, 20, 30, 40, 50};
        System.out.println(binarySearch(prices, 30, 0, prices.length - 1));
    }
}