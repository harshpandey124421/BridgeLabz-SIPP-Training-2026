// Subtopic: Control Flow - if-else and ternary
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        double tax = 0;
        
        if (income < 10000) {
            tax = income * 0.05;
            System.out.println("Bracket: 5%");
        } else if (income >= 10000 && income <= 50000) {
            tax = income * 0.15;
            System.out.println("Bracket: 15%");
        } else {
            tax = income * 0.30;
            System.out.println("Bracket: 30%");
        }
        
        System.out.println("Tax Amount: " + tax);
        sc.close();
    }
}