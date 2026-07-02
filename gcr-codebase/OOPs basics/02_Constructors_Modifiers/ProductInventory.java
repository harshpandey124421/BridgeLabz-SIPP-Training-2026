// Topic: Instance vs Class Variables - Product Inventory
public class ProductInventory {
    String productName;
    double price;
    static int totalProducts = 0;

    public ProductInventory(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        ProductInventory p1 = new ProductInventory("Pen", 2.0);
        p1.displayProductDetails();
        ProductInventory.displayTotalProducts();
    }
}