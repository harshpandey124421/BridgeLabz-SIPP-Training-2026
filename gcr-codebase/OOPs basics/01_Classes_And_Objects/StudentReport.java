// Topic: Classes and Objects - Level 2: Simulate Student Report
public class StudentReport {
    private String name;
    private int rollNumber;
    private double marks;

    public StudentReport(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) return "A";
        if (marks >= 75) return "B";
        if (marks >= 50) return "C";
        return "F";
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Roll: " + rollNumber + ", Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        StudentReport student = new StudentReport("John", 10, 85.5);
        student.displayDetails();
    }
}