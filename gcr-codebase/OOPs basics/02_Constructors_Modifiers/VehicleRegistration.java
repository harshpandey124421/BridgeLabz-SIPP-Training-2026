// Topic: Instance vs Class Variables - Vehicle Registration
public class VehicleRegistration {
    String ownerName;
    String vehicleType;
    static double registrationFee = 100.0;

    public VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        VehicleRegistration v = new VehicleRegistration("Sam", "Car");
        VehicleRegistration.updateRegistrationFee(150.0);
        v.displayVehicleDetails();
    }
}