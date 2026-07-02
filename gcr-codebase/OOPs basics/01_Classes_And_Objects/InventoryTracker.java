// Topic: Classes and Objects - Level 1: Track Inventory of Items
public class InventoryTracker {
    private int itemCode;
    private String itemName;
    private double price;

    public InventoryTracker(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails(int quantity) {
        System.out.println("Item: " + itemName + " (Code: " + itemCode + ")");
        System.out.println("Total Cost for " + quantity + " items: " + (price * quantity));
    }

    public static void main(String[] args) {
        InventoryTracker item = new InventoryTracker(1, "Laptop", 800.0);
        item.displayDetails(3);
    }
}