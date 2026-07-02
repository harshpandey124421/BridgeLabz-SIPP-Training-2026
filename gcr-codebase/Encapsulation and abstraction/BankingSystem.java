abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account: " + accountNumber + ", Holder: " + holderName + ", Balance: " + balance);
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

class CurrentAccount extends BankAccount {
    private double monthlyBonusRate;

    public CurrentAccount(String accountNumber, String holderName, double balance, double monthlyBonusRate) {
        super(accountNumber, holderName, balance);
        this.monthlyBonusRate = monthlyBonusRate;
    }

    public double getMonthlyBonusRate() { return monthlyBonusRate; }
    public void setMonthlyBonusRate(double monthlyBonusRate) { this.monthlyBonusRate = monthlyBonusRate; }

    @Override
    public double calculateInterest() {
        return getBalance() * monthlyBonusRate / 100;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", "John Doe", 1000.0, 4.5);
        CurrentAccount ca = new CurrentAccount("CA456", "Jane Smith", 2000.0, 1.5);

        sa.deposit(500);
        sa.withdraw(200);
        sa.displayAccountDetails();
        System.out.println("Interest: " + sa.calculateInterest());

        ca.deposit(1000);
        ca.withdraw(500);
        ca.displayAccountDetails();
        System.out.println("Interest: " + ca.calculateInterest());
    }
}