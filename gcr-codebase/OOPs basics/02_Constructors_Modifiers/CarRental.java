// Topic: Constructors - Car Rental System
public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 40.0;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Mike", "Sedan", 5);
        System.out.println("Total: $" + rental.calculateTotalCost());
    }
}