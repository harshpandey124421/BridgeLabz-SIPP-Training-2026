interface Trackable {
    void logActivity();
    default void resetData() {
        System.out.println("Tracking data reset to zero.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {
    @Override
    public void logActivity() {
        System.out.println("Activity logged: 5km run.");
    }

    @Override
    public void generateReport() {
        System.out.println("Report generated: 500 calories burned.");
    }

    @Override
    public void sendAlert() {
        System.out.println("Alert: Daily goal reached!");
    }
}

public class FitnessTrackerSystem {
    public static void main(String[] args) {
        FitnessDevice device = new FitnessDevice();
        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();
    }
}