import java.util.Scanner;

public class TriangleAreaL1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        
        double area = 0.5 * base * height;
        
        // Note: Corrected the output string from the prompt's copy-paste error
        System.out.printf("The area of the triangle is %.2f\n", area);
        
        sc.close();
    }
}
