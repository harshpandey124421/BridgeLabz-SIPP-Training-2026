// Subtopic: Practice - Merge Sort Patient Registration IDs
import java.util.Scanner;

public class MergeSortPatientIDs {
    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int[] temp = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;
        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        while (i <= m) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];
        for (i = l, k = 0; i <= r; i++, k++) arr[i] = temp[k];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] ids = new int[n];
            for (int i = 0; i < n; i++) ids[i] = sc.nextInt();
            sort(ids, 0, n - 1);
            for (int id : ids) System.out.print(id + " ");
        }
        sc.close();
    }
}