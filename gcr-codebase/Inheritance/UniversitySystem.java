class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}

class Student extends Person {
    private final String studentId;
    private double gpa;
    private String thesis;

    public Student(String name, String studentId, double gpa, String thesis) {
        super(name);
        this.studentId = studentId;
        this.gpa = gpa;
        this.thesis = thesis;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentId + ", GPA: " + gpa + ", Thesis: " + thesis;
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Student student = new Student("Alice", "S101", 3.8, "AI in Healthcare");
        System.out.println(student.toString());
    }
}