import java.io.*;
import java.util.Scanner;

public class DailyExpenseLogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (FileWriter fw = new FileWriter("expenses.txt", true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw)) {

            System.out.println("Enter Expense Name:");
            String name = sc.nextLine();
            System.out.println("Enter Expense Amount:");
            String amount = sc.nextLine();

            pw.println(name + " - " + amount);
            System.out.println("Expense saved successfully.");

        } catch (IOException e) {
            System.out.println("Error logging expense.");
        }
        sc.close();
    }
}