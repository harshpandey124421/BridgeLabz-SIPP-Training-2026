// Topic: Classes and Objects - Level 2: Simulate an ATM
public class ATMSimulation {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public ATMSimulation(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
        else System.out.println("Insufficient funds");
    }

    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        ATMSimulation atm = new ATMSimulation("Bob", "12345", 1000);
        atm.deposit(500);
        atm.withdraw(200);
        atm.displayBalance();
    }
}