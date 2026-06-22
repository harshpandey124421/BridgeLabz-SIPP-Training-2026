public class UsernameValidator {
    public static boolean isValid(String username, int index) {
        if (index == username.length()) return true;
        char c = username.charAt(index);
        if (c < 'a' || c > 'z') return false;
        return isValid(username, index + 1);
    }
    public static void main(String[] args) {
        System.out.println(isValid("abcdxyz", 0));
    }
}