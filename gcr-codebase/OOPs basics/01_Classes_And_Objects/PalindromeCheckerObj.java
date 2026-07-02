// Topic: Classes and Objects - Level 2: Check Palindrome String
public class PalindromeCheckerObj {
    private String text;

    public PalindromeCheckerObj(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    public void displayResult() {
        System.out.println("Is '" + text + "' a palindrome? " + isPalindrome());
    }

    public static void main(String[] args) {
        PalindromeCheckerObj checker = new PalindromeCheckerObj("racecar");
        checker.displayResult();
    }
}