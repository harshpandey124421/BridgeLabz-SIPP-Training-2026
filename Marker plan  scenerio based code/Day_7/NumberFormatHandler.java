// Subtopic: Exception Handling - NumberFormatException
public class NumberFormatHandler {
    public static void main(String[] args) {
        String inputAmount = "FiveHundred";
        try {
            int amount = Integer.parseInt(inputAmount);
            System.out.println(amount);
        } catch (NumberFormatException e) {
            System.out.println("Error: Bad input format, numbers only please.");
        }
    }
}