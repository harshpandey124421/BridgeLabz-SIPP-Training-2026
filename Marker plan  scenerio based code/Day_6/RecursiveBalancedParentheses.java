// Subtopic: Recursion - Balanced Parentheses (No Stack)
public class RecursiveBalancedParentheses {
    public static boolean isBalanced(String s, int index, int count) {
        if (count < 0) return false;
        if (index == s.length()) return count == 0;
        
        if (s.charAt(index) == '(') count++;
        else if (s.charAt(index) == ')') count--;
        
        return isBalanced(s, index + 1, count);
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("(())()", 0, 0));
    }
}