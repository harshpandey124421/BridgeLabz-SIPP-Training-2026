// Subtopic: Data Types, Variables, and Type Casting
public class RaviProfile {
    public static void main(String[] args) {
        String name = "Ravi";
        int age = 22;
        char rank = 'A';
        double salary = 45000.0;
        float membershipFee = 1500.5f;
        
        int bonus = (int) (salary * 0.12);
        
        System.out.println("Welcome " + name);
        System.out.println("Age: " + age);
        System.out.println("Rank: " + rank);
        System.out.println("Salary: " + salary);
        System.out.println("Fee: " + membershipFee);
        System.out.println("Annual Bonus: " + bonus);
    }
}