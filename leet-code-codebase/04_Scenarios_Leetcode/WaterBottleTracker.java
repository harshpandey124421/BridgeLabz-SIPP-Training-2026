// Topic: Scenarios - Smart Water Bottle Tracker
public class WaterBottleTracker {
    String ownerName;
    double dailyTarget;

    public WaterBottleTracker(String ownerName, double dailyTarget) {
        this.ownerName = ownerName;
        this.dailyTarget = dailyTarget;
    }

    public void displayBottleInfo() {
        System.out.println(ownerName + "'s target is " + dailyTarget + "L");
    }

    public static void main(String[] args) {
        WaterBottleTracker b1 = new WaterBottleTracker("Alice", 2.5);
        WaterBottleTracker b2 = new WaterBottleTracker("Bob", 3.0);
        b1.displayBottleInfo();
        b2.displayBottleInfo();
    }
}