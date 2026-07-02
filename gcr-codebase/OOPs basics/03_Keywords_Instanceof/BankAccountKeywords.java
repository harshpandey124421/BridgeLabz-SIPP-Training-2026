// Topic: Keywords - Bank Account System
public class BankAccountKeywords {
    static String bankName = "Global Bank";
    static int totalAccounts = 0;
    
    final String accountNumber;
    String accountHolderName;

    public BankAccountKeywords(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public static void main(String[] args) {
        BankAccountKeywords acc = new BankAccountKeywords("ACC123", "John Doe");
        if (acc instanceof BankAccountKeywords) {
            System.out.println(acc.accountHolderName + " belongs to " + bankName);
        }
        getTotalAccounts();
    }
}