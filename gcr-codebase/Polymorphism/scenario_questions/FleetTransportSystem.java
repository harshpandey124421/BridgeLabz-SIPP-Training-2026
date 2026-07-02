class Vehicle {
    public double fuelCost(double km) {
        return 0;
    }
}

class Car extends Vehicle {
    @Override
    public double fuelCost(double km) {
        return km * 10.0;
    }
}

class Bus extends Vehicle {
    @Override
    public double fuelCost(double km) {
        return km * 25.0;
    }
}

class Bike extends Vehicle {
    @Override
    public double fuelCost(double km) {
        return km * 3.0;
    }
}

class ElectricCar extends Vehicle {
    @Override
    public double fuelCost(double km) {
        return km * 1.5;
    }
}

public class FleetTransportSystem {
    public static void main(String[] args) {
        Vehicle[] fleet = {new Car(), new Bus(), new Bike(), new ElectricCar()};
        double testDistance = 150.0;
        for (Vehicle v : fleet) {
            if (v instanceof ElectricCar) {
                System.out.print("Electric Car Fuel Cost: ");
            } else if (v instanceof Car) {
                System.out.print("Car Fuel Cost: ");
            } else if (v instanceof Bus) {
                System.out.print("Bus Fuel Cost: ");
            } else if (v instanceof Bike) {
                System.out.print("Bike Fuel Cost: ");
            }
            System.out.println(v.fuelCost(testDistance));
        }
    }
}