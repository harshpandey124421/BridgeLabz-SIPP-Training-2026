// Topic: Keywords - Hospital Management System
public class PatientKeywords {
    static String hospitalName = "City Care";
    static int totalPatients = 0;
    
    final int patientID;
    String name;
    int age;
    String ailment;

    public PatientKeywords(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Admitted: " + totalPatients);
    }

    public static void main(String[] args) {
        PatientKeywords p = new PatientKeywords(1001, "Tom", 45, "Fever");
        if (p instanceof PatientKeywords) {
            System.out.println(p.name + " is at " + hospitalName);
        }
    }
}