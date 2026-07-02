abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public abstract double calculateBill();

    public void displayPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

class InPatient extends Patient {
    private double roomCharges;
    private double treatmentCharges;

    public InPatient(String patientId, String name, int age, double roomCharges, double treatmentCharges) {
        super(patientId, name, age);
        this.roomCharges = roomCharges;
        this.treatmentCharges = treatmentCharges;
    }

    public double getRoomCharges() { return roomCharges; }
    public void setRoomCharges(double roomCharges) { this.roomCharges = roomCharges; }
    public double getTreatmentCharges() { return treatmentCharges; }
    public void setTreatmentCharges(double treatmentCharges) { this.treatmentCharges = treatmentCharges; }

    @Override
    public double calculateBill() {
        return roomCharges + treatmentCharges;
    }
}

class OutPatient extends Patient {
    private double consultationFees;
    private double treatmentCharges;

    public OutPatient(String patientId, String name, int age, double consultationFees, double treatmentCharges) {
        super(patientId, name, age);
        this.consultationFees = consultationFees;
        this.treatmentCharges = treatmentCharges;
    }

    public double getConsultationFees() { return consultationFees; }
    public void setConsultationFees(double consultationFees) { this.consultationFees = consultationFees; }
    public double getTreatmentCharges() { return treatmentCharges; }
    public void setTreatmentCharges(double treatmentCharges) { this.treatmentCharges = treatmentCharges; }

    @Override
    public double calculateBill() {
        return consultationFees + treatmentCharges;
    }
}

public class HospitalPatientManagementSystem {
    public static void main(String[] args) {
        InPatient ip = new InPatient("P001", "Mark", 45, 500.0, 1200.0);
        OutPatient op = new OutPatient("P002", "Lucy", 30, 150.0, 300.0);

        ip.displayPatientDetails();
        System.out.println("Bill: " + ip.calculateBill());

        op.displayPatientDetails();
        System.out.println("Bill: " + op.calculateBill());
    }
}