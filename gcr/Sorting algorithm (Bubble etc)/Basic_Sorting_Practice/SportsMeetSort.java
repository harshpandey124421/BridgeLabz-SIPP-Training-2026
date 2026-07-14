// Subtopic: Scenario - Sports Meet Bubble and Insertion Sort
public class SportsMeetSort {
    public static int bubbleSortWithSwapCount(int[] scores) {
        int n = scores.length;
        int swaps = 0;
        boolean sorted;
        for (int i = 0; i < n - 1; i++) {
            sorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (scores[j] > scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                    swaps++;
                    sorted = false;
                }
            }
            if (sorted) break;
        }
        return swaps;
    }

    public static void insertionSort(int[] scores) {
        int n = scores.length;
        for (int i = 1; i < n; i++) {
            int key = scores[i];
            int j = i - 1;
            while (j >= 0 && scores[j] > key) {
                scores[j + 1] = scores[j];
                j = j - 1;
            }
            scores[j + 1] = key;
        }
    }

    public static void printTop3(int[] sortedScores) {
        int n = sortedScores.length;
        for (int i = 1; i <= 3 && n - i >= 0; i++) {
            System.out.println(sortedScores[n - i]);
        }
    }
}