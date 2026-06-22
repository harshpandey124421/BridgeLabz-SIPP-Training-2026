// Subtopic: Exception Handling - ArithmeticException
public class DivisionByZeroHandler {
    public static void main(String[] args) {
        try {
            int totalBill = 5000;
            int items = 0;
            int costPerItem = totalBill / items;
            System.out.println(costPerItem);
        } catch (ArithmeticException e) {
            System.out.println("Error: Bills with zero items cannot be processed.");
        }
    }
}