import java.util.Scanner;
public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        double[][] marks = new double[students][3];
        double[] percentages = new double[students];
        String[] grades = new String[students];
        for (int i = 0; i < students; i++) {
            double p = sc.nextDouble();
            double c = sc.nextDouble();
            double m = sc.nextDouble();
            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Positive values only");
                i--;
            } else {
                marks[i][0] = p;
                marks[i][1] = c;
                marks[i][2] = m;
                percentages[i] = ((p + c + m) / 300) * 100;
                if (percentages[i] >= 80) grades[i] = "A";
                else if (percentages[i] >= 70) grades[i] = "B";
                else if (percentages[i] >= 60) grades[i] = "C";
                else if (percentages[i] >= 50) grades[i] = "D";
                else if (percentages[i] >= 40) grades[i] = "E";
                else grades[i] = "R";
            }
        }
        for (int i = 0; i < students; i++) {
            System.out.println("P: " + marks[i][0] + " C: " + marks[i][1] + " M: " + marks[i][2] + " Pct: " + percentages[i] + " Grade: " + grades[i]);
        }
        sc.close();
    }
}