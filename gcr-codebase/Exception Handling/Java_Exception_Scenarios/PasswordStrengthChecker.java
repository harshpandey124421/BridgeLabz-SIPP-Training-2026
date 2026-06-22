import java.util.Scanner;

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String msg) {
        super(msg);
    }
}

public class PasswordStrengthChecker {
    public static void checkPassword(String password) throws InvalidPasswordException {
        if (password == null || password.isEmpty()) {
            throw new InvalidPasswordException("Error: Password cannot be null or empty.");
        }
        if (password.length() < 8) {
            throw new InvalidPasswordException("Error: Password length must be at least 8 characters.");
        }
        if (!Character.isUpperCase(password.charAt(0))) {
            throw new InvalidPasswordException("Error: The first character must be uppercase.");
        }
        if (!Character.isDigit(password.charAt(password.length() - 1))) {
            throw new InvalidPasswordException("Error: The last character must be a digit.");
        }
        
        boolean hasSpecial = false;
        String specials = "@#\$%&*";
        for (int i = 0; i < password.length(); i++) {
            if (specials.indexOf(password.charAt(i)) != -1) {
                hasSpecial = true;
                break;
            }
        }
        
        if (!hasSpecial) {
            throw new InvalidPasswordException("Error: Password must contain at least one special character.");
        }
        
        System.out.println("Password is strong and valid.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pwd = sc.nextLine();
        try {
            checkPassword(pwd);
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}