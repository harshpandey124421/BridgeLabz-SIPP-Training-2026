// Topic: Keywords - Employee Management System
public class EmployeeKeywords {
    static String companyName = "Tech Corp";
    static int totalEmployees = 0;
    
    final int id;
    String name;
    String designation;

    public EmployeeKeywords(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
        EmployeeKeywords emp = new EmployeeKeywords(1, "Alice", "Developer");
        if (emp instanceof EmployeeKeywords) {
            System.out.println(emp.name + " works at " + companyName);
        }
        displayTotalEmployees();
    }
}