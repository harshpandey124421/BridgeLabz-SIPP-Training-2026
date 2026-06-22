// Subtopic: 1D Arrays - Min, Max, and Traversal
public class WarehouseStock {
    public static void main(String[] args) {
        int[] stock = {50, 20, 100, 40, 80};
        int max = stock[0];
        int min = stock[0];
        int total = 0;
        
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] > max) max = stock[i];
            if (stock[i] < min) min = stock[i];
            total += stock[i];
        }
        
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Total Stock: " + total);
    }
}