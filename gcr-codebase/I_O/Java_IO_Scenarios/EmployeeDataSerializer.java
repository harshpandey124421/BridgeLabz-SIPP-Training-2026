import java.io.*;
import java.util.Scanner;

class Employee implements Serializable {
    int employeeId;
    String name;
    String department;
    double salary;

    public Employee(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Dept: " + department + ", Salary: " + salary);
    }
}

public class EmployeeDataSerializer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        String dept = sc.nextLine();
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, dept, salary);

        try (FileOutputStream fos = new FileOutputStream("employee.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(emp);
        } catch (IOException e) {
            System.out.println("Serialization error.");
        }

        try (FileInputStream fis = new FileInputStream("employee.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Employee restoredEmp = (Employee) ois.readObject();
            restoredEmp.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error.");
        }
        
        sc.close();
    }
}