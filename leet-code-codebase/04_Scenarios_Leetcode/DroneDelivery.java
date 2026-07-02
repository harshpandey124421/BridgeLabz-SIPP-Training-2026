// Topic: Scenarios - Drone Delivery System
public class DroneDelivery {
    static String companyName = "FastLogistics";
    String droneId;
    int batteryPercentage;

    public DroneDelivery(String droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    public void startDelivery() {
        if (batteryPercentage > 10) System.out.println("Delivery started.");
        else System.out.println("Low battery.");
    }

    public void displayStatus() {
        System.out.println("Drone: " + droneId + " | Battery: " + batteryPercentage + "% | Company: " + companyName);
    }

    public static void main(String[] args) {
        DroneDelivery d1 = new DroneDelivery("D-01", 80);
        DroneDelivery d2 = new DroneDelivery("D-02", 100);
        d1.displayStatus();
        d2.displayStatus();
    }
}