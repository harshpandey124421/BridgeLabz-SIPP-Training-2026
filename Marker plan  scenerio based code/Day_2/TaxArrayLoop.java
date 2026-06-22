// Subtopic: Loops - for loop and array iteration
public class TaxArrayLoop {
    public static void main(String[] args) {
        int[] incomes = {8000, 15000, 60000, 45000, 9500, 100000, 25000, 5000, 55000, 12000};
        double totalTax = 0;
        
        for (int i = 0; i < incomes.length; i++) {
            double tax = 0;
            if (incomes[i] < 10000) {
                tax = incomes[i] * 0.05;
            } else if (incomes[i] >= 10000 && incomes[i] <= 50000) {
                tax = incomes[i] * 0.15;
            } else {
                tax = incomes[i] * 0.30;
            }
            totalTax += tax;
        }
        
        System.out.println("Total tax collected: " + totalTax);
    }
}