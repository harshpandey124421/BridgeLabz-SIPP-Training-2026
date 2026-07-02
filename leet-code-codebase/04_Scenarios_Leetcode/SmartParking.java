// Topic: Scenarios - Smart Parking Management
class VehicleParking {
    String vehicleNumber;
    String ownerName;
    String vehicleType;

    public VehicleParking(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
}

public class SmartParking {
    VehicleParking[] parked = new VehicleParking[10];
    int count = 0;

    public void addVehicle(VehicleParking v) {
        if (count < 10) parked[count++] = v;
    }

    public void displayCars() {
        for (int i = 0; i < count; i++) {
            if (parked[i].vehicleType.equalsIgnoreCase("Car")) {
                System.out.println("Car: " + parked[i].vehicleNumber);
            }
        }
    }

    public void displayBikes() {
        for (int i = 0; i < count; i++) {
            if (parked[i].vehicleType.equalsIgnoreCase("Bike")) {
                System.out.println("Bike: " + parked[i].vehicleNumber);
            }
        }
    }

    public static void main(String[] args) {
        SmartParking sp = new SmartParking();
        sp.addVehicle(new VehicleParking("ABC-12", "Tom", "Car"));
        sp.addVehicle(new VehicleParking("XYZ-99", "Sam", "Bike"));
        sp.displayCars();
        sp.displayBikes();
    }
}