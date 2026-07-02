// Topic: Classes and Objects - Level 1: Employee Details
public class EmployeeDetails {
    private int id;
    private String name;
    private double salary;

    public EmployeeDetails(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        EmployeeDetails emp = new EmployeeDetails(101, "Alice", 50000);
        emp.displayDetails();
    }
}