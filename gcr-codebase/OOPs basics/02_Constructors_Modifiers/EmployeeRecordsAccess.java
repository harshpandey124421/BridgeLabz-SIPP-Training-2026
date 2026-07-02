// Topic: Access Modifiers - Employee Records
class EmployeeAcc {
    public int employeeID;
    protected String department;
    private double salary;

    public EmployeeAcc(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}

class Manager extends EmployeeAcc {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }
    public void show() {
        System.out.println("ID: " + employeeID + ", Dept: " + department);
    }
}

public class EmployeeRecordsAccess {
    public static void main(String[] args) {
        Manager m = new Manager(101, "IT", 90000);
        m.show();
    }
}