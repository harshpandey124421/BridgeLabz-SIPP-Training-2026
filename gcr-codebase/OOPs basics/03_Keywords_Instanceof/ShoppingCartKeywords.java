// Topic: Keywords - Shopping Cart System
public class ShoppingCartKeywords {
    static double discount = 10.0;
    final int productID;
    String productName;
    double price;
    int quantity;

    public ShoppingCartKeywords(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public static void main(String[] args) {
        ShoppingCartKeywords item = new ShoppingCartKeywords(101, "Laptop", 1000, 1);
        if (item instanceof ShoppingCartKeywords) {
            updateDiscount(15.0);
            System.out.println("Discount is now " + discount + "%");
        }
    }
}