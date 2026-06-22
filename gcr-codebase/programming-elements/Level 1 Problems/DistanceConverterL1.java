import java.util.Scanner;

public class DistanceConverterL1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        
        double yards = distanceInFeet / 3.0;
        double miles = yards / 1760.0;
        
        // Note: Corrected the output string from the prompt's copy-paste error
        System.out.printf("The distance in yards is %.2f and in miles is %.5f\n", yards, miles);
        
        sc.close();
    }
}
