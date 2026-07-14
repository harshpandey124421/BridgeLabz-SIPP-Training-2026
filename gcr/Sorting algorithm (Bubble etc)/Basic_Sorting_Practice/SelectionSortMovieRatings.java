// Subtopic: Additional 1 - Selection Sort Movie Ratings
import java.util.Scanner;

public class SelectionSortMovieRatings {
    public static void sortRatings(int[] ratings) {
        int n = ratings.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (ratings[j] < ratings[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = ratings[minIdx];
            ratings[minIdx] = ratings[i];
            ratings[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] ratings = new int[n];
            for (int i = 0; i < n; i++) {
                ratings[i] = sc.nextInt();
            }
            sortRatings(ratings);
            for (int r : ratings) {
                System.out.print(r + " ");
            }
        }
        sc.close();
    }
}