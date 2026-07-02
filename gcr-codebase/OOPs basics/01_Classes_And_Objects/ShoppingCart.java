// Topic: Classes and Objects - Level 2: Simulate a Shopping Cart
public class ShoppingCart {
    private String itemName;
    private double price;
    private int quantity;

    public ShoppingCart(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }

    public void addItem(int qty) {
        this.quantity += qty;
    }

    public void removeItem(int qty) {
        if (this.quantity >= qty) this.quantity -= qty;
        else this.quantity = 0;
    }

    public void displayTotal() {
        System.out.println("Total Cost for " + itemName + ": $" + (price * quantity));
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart("Shoes", 50.0);
        cart.addItem(2);
        cart.displayTotal();
    }
}