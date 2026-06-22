// Subtopic: 1D Arrays - Frequency and Duplicates
public class DuplicateDetector {
    public static void main(String[] args) {
        int[] stock = {50, 20, 100, 40, 20, 80, 50};
        
        for (int i = 0; i < stock.length; i++) {
            for (int j = i + 1; j < stock.length; j++) {
                if (stock[i] == stock[j]) {
                    System.out.println("Duplicate found: " + stock[i]);
                }
            }
        }
    }
}