// Topic: Scenarios - Bank Account System
public class BankAccountSimulation {
    static int totalAccounts = 0;
    String accountNumber;
    String holder;
    double balance;

    public BankAccountSimulation(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
        else System.out.println("Overdraft blocked");
    }

    public void getStatement() {
        System.out.println("Acc: " + accountNumber + " | Bal: " + balance);
    }

    public static void main(String[] args) {
        BankAccountSimulation acc1 = new BankAccountSimulation("001", "Alice", 100);
        BankAccountSimulation acc2 = new BankAccountSimulation("002", "Bob", 200);
        BankAccountSimulation acc3 = new BankAccountSimulation("003", "Charlie", 300);
        
        acc1.deposit(50);
        acc1.withdraw(20);
        acc1.getStatement();
        System.out.println("Total accounts: " + totalAccounts);
    }
}