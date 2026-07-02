// Topic: Classes and Objects - Level 1: Handle Mobile Phone Details
public class MobilePhoneDetails {
    private String brand;
    private String model;
    private double price;

    public MobilePhoneDetails(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: $" + price);
    }

    public static void main(String[] args) {
        MobilePhoneDetails phone = new MobilePhoneDetails("Apple", "iPhone 14", 999.99);
        phone.displayDetails();
    }
}