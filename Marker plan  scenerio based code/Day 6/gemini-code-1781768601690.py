import os

java_code = """import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] patients = {"Alice", "Bob", "Charlie", "David"};
        
        try {
            System.out.print("Enter patient index: ");
            int index = Integer.parseInt(sc.nextLine());
            String patientName = patients[index];
            
            System.out.print("Enter total bill amount: ");
            int totalBill = Integer.parseInt(sc.nextLine());
            
            System.out.print("Enter number of items on bill: ");
            int items = Integer.parseInt(sc.nextLine());
            
            int averageItemCost = totalBill / items;
            System.out.println("Average cost per item: " + averageItemCost);
            
            System.out.print("Enter payment amount: ");
            int payment = Integer.parseInt(sc.nextLine());
            
            if (payment < totalBill) {
                throw new InsufficientFundsException("Payment failed: Insufficient funds.");
            }
            
            System.out.println("Payment successful for patient: " + patientName);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero. The bill cannot have zero items.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index. Patient record does not exist.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Bad input. Please enter valid numeric values only.");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
"""

def generate_billing_system():
    filename = "HospitalBillingSystem.java"
    with open(filename, "w") as file:
        file.write(java_code)
    print(f"Success: Created {filename} without comments, featuring full exception handling.")

if __name__ == "__main__":
    generate_billing_system()