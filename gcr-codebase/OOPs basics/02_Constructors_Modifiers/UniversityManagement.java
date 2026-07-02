// Topic: Access Modifiers - University Management System
class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() { return cgpa; }
    public void setCgpa(double cgpa) { this.cgpa = cgpa; }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }
    public void show() {
        System.out.println("Name (protected access): " + name);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(1, "Alice", 3.8);
        pg.show();
    }
}