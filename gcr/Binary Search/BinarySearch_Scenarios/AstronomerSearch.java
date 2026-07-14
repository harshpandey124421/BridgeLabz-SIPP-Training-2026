// Subtopic: Binary Search - Astronomer Star Brightness Search
public class AstronomerSearch {
    public static int searchBrightness(int[] catalog, int target) {
        int left = 0;
        int right = catalog.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (catalog[mid] == target) {
                return mid;
            }
            if (catalog[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}