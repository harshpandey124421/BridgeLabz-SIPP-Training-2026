class InsufficientBalanceException extends Exception {
    private double shortfall;

    public InsufficientBalanceException(String message, double shortfall) {
        super(message);
        this.shortfall = shortfall;
    }

    public double getShortfall() {
        return shortfall;
    }
}

public class ATMWithdrawalSystem {
    public static void processWithdrawal(double balance, double request) throws InsufficientBalanceException {
        if (request > balance) {
            throw new InsufficientBalanceException("Transaction failed.", request - balance);
        }
        System.out.println("Withdrawal successful.");
    }

    public static void main(String[] args) {
        double balance = 5000;
        double request = 8000;
        
        try {
            processWithdrawal(balance, request);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage() + " Shortfall amount: " + e.getShortfall());
        }
    }
}