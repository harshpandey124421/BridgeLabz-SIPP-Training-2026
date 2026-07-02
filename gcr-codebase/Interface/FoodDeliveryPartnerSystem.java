interface FoodDelivery {
    void deliverFood(String customerName);
    
    default void trackOrder() {
        System.out.println("Tracking: Driver is 5 minutes away.");
    }
}

interface GroceryDelivery {
    void deliverGrocery(String customerName);
    
    default void trackOrder() {
        System.out.println("Tracking: Groceries are being packed.");
    }
}

class DeliveryExecutive implements FoodDelivery, GroceryDelivery {
    public static String generateDeliveryCode() {
        return "DEL" + (int)(Math.random() * 10000);
    }

    @Override
    public void deliverFood(String customerName) {
        System.out.println("Delivering food to " + customerName + ". Code: " + generateDeliveryCode());
    }

    @Override
    public void deliverGrocery(String customerName) {
        System.out.println("Delivering groceries to " + customerName + ". Code: " + generateDeliveryCode());
    }

    @Override
    public void trackOrder() {
        System.out.println("General Delivery Tracking Active.");
    }
}

public class FoodDeliveryPartnerSystem {
    public static void main(String[] args) {
        String[] customers = {"Charlie", "Diana"};
        
        DeliveryExecutive executive = new DeliveryExecutive();
        executive.trackOrder();
        
        for (String customer : customers) {
            executive.deliverFood(customer);
            executive.deliverGrocery(customer);
        }
    }
}