import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class HospitalBilling {
    public static void processPayment(double required, double available) throws InsufficientFundsException {
        if (available < required) {
            throw new InsufficientFundsException("Payment failed: Insufficient Funds");
        }
        System.out.println("Payment successful");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            int totalCost = Integer.parseInt(sc.next());
            int items = sc.nextInt();
            System.out.println(totalCost / items);
        } catch (ArithmeticException e) {
            System.out.println("Error: Bills with zero items");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input format");
        }

        try {
            int[] patients = {101, 102, 103};
            int index = sc.nextInt();
            System.out.println(patients[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index");
        }

        try {
            processPayment(5000, 2000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        
        sc.close();
    }
}