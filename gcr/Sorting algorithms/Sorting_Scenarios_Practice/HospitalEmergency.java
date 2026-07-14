// Subtopic: Additional - Hospital Emergency
public class HospitalEmergency {
    public static int findKthPriority(int[] priorities, int k) {
        return quickSelect(priorities, 0, priorities.length - 1, priorities.length - k);
    }

    private static int quickSelect(int[] arr, int left, int right, int kSmallest) {
        if (left == right) return arr[left];
        int pivotIndex = partition(arr, left, right);
        if (kSmallest == pivotIndex) {
            return arr[kSmallest];
        } else if (kSmallest < pivotIndex) {
            return quickSelect(arr, left, pivotIndex - 1, kSmallest);
        } else {
            return quickSelect(arr, pivotIndex + 1, right, kSmallest);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[right];
        arr[right] = temp;
        return i;
    }
}