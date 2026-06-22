// Subtopic: Strings - Palindrome validation
public class PalindromeCheck {
    public static void main(String[] args) {
        String msg = "racecar";
        String reversed = new StringBuilder(msg).reverse().toString();
        
        if (msg.equals(reversed)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}