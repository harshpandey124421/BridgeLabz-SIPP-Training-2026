import java.util.*;

public class Q2_SmartParkingSlotManager {
    static ArrayList<String> parkedVehicles = new ArrayList<>();

    static void enterParking(String vehicleNumber) {
        parkedVehicles.add(vehicleNumber);
        System.out.println(vehicleNumber + " entered the parking area.");
    }

    static void exitParking(String vehicleNumber) {
        if (parkedVehicles.remove(vehicleNumber)) {
            System.out.println(vehicleNumber + " exited the parking area.");
        } else {
            System.out.println(vehicleNumber + " not found in parking area.");
        }
    }

    static void searchVehicle(String vehicleNumber) {
        if (parkedVehicles.contains(vehicleNumber)) {
            System.out.println(vehicleNumber + " is currently parked.");
        } else {
            System.out.println(vehicleNumber + " is not parked here.");
        }
    }

    static void displayVehicles() {
        System.out.println("Vehicles currently parked:");
        for (String v : parkedVehicles) {
            System.out.println(v);
        }
        System.out.println("Total occupied slots: " + parkedVehicles.size());
    }

    public static void main(String[] args) {
        enterParking("UP80AB1234");
        enterParking("DL5CX7788");
        enterParking("HR26BC5678");

        System.out.println();
        searchVehicle("DL5CX7788");
        searchVehicle("MP09XY0001");

        System.out.println();
        exitParking("UP80AB1234");
        exitParking("KA01ZZ0000");

        System.out.println();
        displayVehicles();
    }
}
