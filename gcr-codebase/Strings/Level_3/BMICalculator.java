import java.util.Scanner;
public class BMICalculator {
    public static String[][] getBMIAndStatus(double weight, double heightCm) {
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        String status = "";
        if (bmi <= 18.4) status = "Underweight";
        else if (bmi <= 24.9) status = "Normal";
        else if (bmi <= 39.9) status = "Overweight";
        else status = "Obese";
        return new String[][]{{String.valueOf(bmi), status}};
    }
    public static String[][] computeAll(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(data[i][0]);
            String[][] bmiData = getBMIAndStatus(data[i][0], data[i][1]);
            result[i][2] = bmiData[0][0];
            result[i][3] = bmiData[0][1];
        }
        return result;
    }
    public static void display(String[][] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println("Ht: " + result[i][0] + " Wt: " + result[i][1] + " BMI: " + result[i][2] + " Status: " + result[i][3]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }
        String[][] res = computeAll(data);
        display(res);
        sc.close();
    }
}