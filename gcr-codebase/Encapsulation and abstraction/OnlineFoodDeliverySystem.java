abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public abstract double calculateTotalPrice();

    public void displayItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Qty: " + quantity);
    }
}

class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

class NonVegItem extends FoodItem {
    private double serviceCharge;

    public NonVegItem(String itemName, double price, int quantity, double serviceCharge) {
        super(itemName, price, quantity);
        this.serviceCharge = serviceCharge;
    }

    public double getServiceCharge() { return serviceCharge; }
    public void setServiceCharge(double serviceCharge) { this.serviceCharge = serviceCharge; }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + serviceCharge;
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        VegItem veg = new VegItem("Salad", 5.0, 2);
        NonVegItem nonVeg = new NonVegItem("Chicken Burger", 8.0, 1, 1.5);

        veg.displayItemDetails();
        System.out.println("Total Price: " + veg.calculateTotalPrice());

        nonVeg.displayItemDetails();
        System.out.println("Total Price: " + nonVeg.calculateTotalPrice());
    }
}