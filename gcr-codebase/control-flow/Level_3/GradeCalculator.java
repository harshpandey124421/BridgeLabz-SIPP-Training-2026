import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double c = sc.nextDouble();
        double m = sc.nextDouble();
        double pct = ((p + c + m) / 300) * 100;
        System.out.println("Percentage: " + pct);
        if (pct >= 80) System.out.println("Grade: A, Remarks: Level 4");
        else if (pct >= 70) System.out.println("Grade: B, Remarks: Level 3");
        else if (pct >= 60) System.out.println("Grade: C, Remarks: Level 2");
        else if (pct >= 50) System.out.println("Grade: D, Remarks: Level 1");
        else if (pct >= 40) System.out.println("Grade: E, Remarks: Level 1-");
        else System.out.println("Grade: R, Remarks: Remedial standards");
        sc.close();
    }
}