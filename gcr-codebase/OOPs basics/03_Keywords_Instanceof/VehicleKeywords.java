// Topic: Keywords - Vehicle Registration System
public class VehicleKeywords {
    static double registrationFee = 200.0;
    final String registrationNumber;
    String ownerName;
    String vehicleType;

    public VehicleKeywords(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        VehicleKeywords v = new VehicleKeywords("XYZ-123", "Sarah", "SUV");
        if (v instanceof VehicleKeywords) {
            System.out.println(v.ownerName + " owns " + v.registrationNumber);
        }
    }
}