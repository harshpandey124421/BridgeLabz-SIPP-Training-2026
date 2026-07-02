// Topic: Access Modifiers - Bank Account Management
class Account {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}

class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }
    public void show() {
        System.out.println("Acc: " + accountNumber + ", Holder: " + accountHolder);
    }
}

public class BankAccountAccess {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("999", "Eve", 1000);
        sa.show();
    }
}