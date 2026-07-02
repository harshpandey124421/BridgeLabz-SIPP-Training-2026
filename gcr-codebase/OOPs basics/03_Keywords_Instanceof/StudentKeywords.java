// Topic: Keywords - University Student Management
public class StudentKeywords {
    static String universityName = "State Univ";
    static int totalStudents = 0;
    
    final int rollNumber;
    String name;
    String grade;

    public StudentKeywords(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public static void main(String[] args) {
        StudentKeywords s = new StudentKeywords(55, "Mark", "A");
        if (s instanceof StudentKeywords) {
            System.out.println(s.name + " is enrolled at " + universityName);
        }
    }
}