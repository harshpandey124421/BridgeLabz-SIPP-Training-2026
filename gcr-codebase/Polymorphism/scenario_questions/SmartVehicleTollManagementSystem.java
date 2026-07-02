class Vehicle {
    String vehicleNumber;
    String ownerName;

    public Vehicle(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    public double calculateToll() {
        return 0;
    }
}

class Car extends Vehicle {
    public Car(String num, String name) {
        super(num, name);
    }

    @Override
    public double calculateToll() {
        return 50.0;
    }
}

class Bus extends Vehicle {
    public Bus(String num, String name) {
        super(num, name);
    }

    @Override
    public double calculateToll() {
        return 120.0;
    }
}

class Truck extends Vehicle {
    public Truck(String num, String name) {
        super(num, name);
    }

    @Override
    public double calculateToll() {
        return 200.0;
    }
}

public class SmartVehicleTollManagementSystem {
    public static void main(String[] args) {
        Vehicle[] tollRegistry = {
            new Car("MH12AB1234", "Anand"),
            new Bus("DL01CD5678", "Rajesh"),
            new Truck("KA03EF9012", "Suresh"),
            new Car("MH14XY9876", "Pooja")
        };
        double totalRevenue = 0;
        Vehicle highestTollVehicle = tollRegistry[0];
        int cars = 0, buses = 0, trucks = 0;
        for (Vehicle v : tollRegistry) {
            double fee = v.calculateToll();
            totalRevenue += fee;
            if (fee > highestTollVehicle.calculateToll()) {
                highestTollVehicle = v;
            }
            if (v instanceof Car) cars++;
            else if (v instanceof Bus) buses++;
            else if (v instanceof Truck) trucks++;
        }
        System.out.println("Total Revenue Gathered: " + totalRevenue);
        System.out.println("Highest Paid Toll Registration: " + highestTollVehicle.vehicleNumber + " (Owner: " + highestTollVehicle.ownerName + ")");
        System.out.println("Fleet Counts -> Cars: " + cars + " | Buses: " + buses + " | Trucks: " + trucks);
    }
}