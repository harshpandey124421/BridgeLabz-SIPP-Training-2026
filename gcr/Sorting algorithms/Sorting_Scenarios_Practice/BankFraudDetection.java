// Subtopic: Additional - Bank Fraud Detection
public class BankFraudDetection {
    public static int countSuspiciousPairs(int[] amount) {
        return mergeSort(amount, 0, amount.length - 1);
    }

    private static int mergeSort(int[] arr, int left, int right) {
        if (left >= right) return 0;
        int mid = left + (right - left) / 2;
        int count = mergeSort(arr, left, mid) + mergeSort(arr, mid + 1, right);
        
        int j = mid + 1;
        for (int i = left; i <= mid; i++) {
            while (j <= right && arr[i] > 3L * arr[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }
        
        merge(arr, left, mid, right);
        return count;
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];
        for (i = left, k = 0; i <= right; i++, k++) arr[i] = temp[k];
    }
}