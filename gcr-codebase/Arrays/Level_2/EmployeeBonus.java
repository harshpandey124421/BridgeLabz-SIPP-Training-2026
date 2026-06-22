import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salaries = new double[10];
        double[] years = new double[10];
        double[] newSalaries = new double[10];
        double[] bonusAmounts = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
            double s = sc.nextDouble();
            double y = sc.nextDouble();
            if (s < 0 || y < 0) {
                System.out.println("Invalid input. Try again.");
                i--;
            } else {
                salaries[i] = s;
                years[i] = y;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonusAmounts[i] = salaries[i] * 0.05;
            } else {
                bonusAmounts[i] = salaries[i] * 0.02;
            }
            newSalaries[i] = salaries[i] + bonusAmounts[i];
            totalBonus += bonusAmounts[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        sc.close();
    }
}