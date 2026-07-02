class Order {
    private String orderId;
    private String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void displayOrderStatus() {
        System.out.println("Order ID: " + orderId + ", Date: " + orderDate + " [Status: Placed]");
    }
}

class ShippedOrder extends Order {
    private String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void displayOrderStatus() {
        System.out.println("Order ID: " + getOrderId() + ", Date: " + getOrderDate() + 
                           ", Tracking Number: " + trackingNumber + " [Status: Shipped]");
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void displayOrderStatus() {
        System.out.println("Order ID: " + getOrderId() + ", Date: " + getOrderDate() + 
                           ", Tracking Number: " + getTrackingNumber() + 
                           ", Delivery Date: " + deliveryDate + " [Status: Delivered]");
    }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order baseOrder = new Order("ORD100", "2023-11-01");
        ShippedOrder shippedOrder = new ShippedOrder("ORD101", "2023-11-02", "TRK987654");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD102", "2023-11-03", "TRK123456", "2023-11-05");

        baseOrder.displayOrderStatus();
        shippedOrder.displayOrderStatus();
        deliveredOrder.displayOrderStatus();
    }
}