import java.util.Scanner;
public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageAmar = sc.nextInt(); double heightAmar = sc.nextDouble();
        int ageAkbar = sc.nextInt(); double heightAkbar = sc.nextDouble();
        int ageAnthony = sc.nextInt(); double heightAnthony = sc.nextDouble();
        
        int minAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        double maxHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        
        System.out.println("Youngest age: " + minAge);
        System.out.println("Tallest height: " + maxHeight);
        sc.close();
    }
}