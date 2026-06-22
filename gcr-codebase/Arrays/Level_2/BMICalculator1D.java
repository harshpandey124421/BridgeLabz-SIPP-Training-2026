import java.util.Scanner;
public class BMICalculator1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double[] weights = new double[number];
        double[] heights = new double[number];
        double[] bmis = new double[number];
        String[] statuses = new String[number];
        for (int i = 0; i < number; i++) {
            weights[i] = sc.nextDouble();
            heights[i] = sc.nextDouble();
            double heightInMeters = heights[i] / 100;
            bmis[i] = weights[i] / (heightInMeters * heightInMeters);
            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.println("Height: " + heights[i] + " Weight: " + weights[i] + " BMI: " + bmis[i] + " Status: " + statuses[i]);
        }
        sc.close();
    }
}