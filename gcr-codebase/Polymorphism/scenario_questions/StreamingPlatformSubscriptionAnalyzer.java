class Subscription {
    String subscriberName;
    String subscriptionId;

    public Subscription(String subscriberName, String subscriptionId) {
        this.subscriberName = subscriberName;
        this.subscriptionId = subscriptionId;
    }

    public double calculateMonthlyCharge() {
        return 0;
    }
}

class BasicPlan extends Subscription {
    public BasicPlan(String name, String id) {
        super(name, id);
    }

    @Override
    public double calculateMonthlyCharge() {
        return 199.0;
    }
}

class PremiumPlan extends Subscription {
    public PremiumPlan(String name, String id) {
        super(name, id);
    }

    @Override
    public double calculateMonthlyCharge() {
        return 499.0;
    }
}

class FamilyPlan extends Subscription {
    public FamilyPlan(String name, String id) {
        super(name, id);
    }

    @Override
    public double calculateMonthlyCharge() {
        return 799.0;
    }
}

public class StreamingPlatformSubscriptionAnalyzer {
    public static void main(String[] args) {
        Subscription[] safeDb = {
            new BasicPlan("Amit", "SUB-B01"),
            new PremiumPlan("Binny", "SUB-P02"),
            new FamilyPlan("Anusha", "SUB-F03")
        };
        double totalRev = 0;
        Subscription prime = safeDb[0];
        char prefix = 'A';
        System.out.println("Subscribers matching prefix string '" + prefix + "':");
        for (Subscription s : safeDb) {
            double cost = s.calculateMonthlyCharge();
            totalRev += cost;
            if (cost > prime.calculateMonthlyCharge()) {
                prime = s;
            }
            if (s.subscriberName.length() > 0 && s.subscriberName.charAt(0) == prefix) {
                System.out.println("- " + s.subscriberName + " (" + s.subscriptionId + ")");
            }
        }
        System.out.println("\nTotal Monthly Revenue stream: " + totalRev);
        System.out.println("Most Expensive Active Target: " + prime.subscriptionId + " belonging to " + prime.subscriberName);
    }
}