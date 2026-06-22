// Subtopic: Exception Handling - Custom Exceptions
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class CustomFundsExceptionDemo {
    public static void processPayment(double balance, double cost) throws InsufficientFundsException {
        if (balance < cost) {
            throw new InsufficientFundsException("Payment failed: Insufficient Funds.");
        }
        System.out.println("Payment processed successfully.");
    }

    public static void main(String[] args) {
        try {
            processPayment(100.0, 500.0);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}