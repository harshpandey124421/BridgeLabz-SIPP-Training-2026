interface HeartRateMonitor {
    void monitorHeartRate(String patientId, int bpm);
    
    default void displayHealthTips() {
        System.out.println("Tip: 30 mins of daily cardio improves heart health.");
    }
}

interface TemperatureMonitor {
    void monitorTemperature(String patientId, double tempF);
    
    default void displayHealthTips() {
        System.out.println("Tip: Stay hydrated to maintain body temperature.");
    }
}

class HealthMonitoringSystem implements HeartRateMonitor, TemperatureMonitor {
    public static boolean isPatientIdValid(String patientId) {
        return patientId != null && patientId.startsWith("PT");
    }

    @Override
    public void monitorHeartRate(String patientId, int bpm) {
        if (isPatientIdValid(patientId)) {
            System.out.println("Patient " + patientId + " Heart Rate: " + bpm + " bpm");
        }
    }

    @Override
    public void monitorTemperature(String patientId, double tempF) {
        if (isPatientIdValid(patientId)) {
            System.out.println("Patient " + patientId + " Temperature: " + tempF + " F");
        }
    }

    @Override
    public void displayHealthTips() {
        HeartRateMonitor.super.displayHealthTips();
        TemperatureMonitor.super.displayHealthTips();
    }
}

public class SmartHealthcareMonitoringSystem {
    public static void main(String[] args) {
        String[] patients = {"John", "Emma"};
        String[] ids = {"PT001", "P002"};
        
        HealthMonitoringSystem system = new HealthMonitoringSystem();
        system.displayHealthTips();
        
        for (int i = 0; i < patients.length; i++) {
            System.out.println("Monitoring: " + patients[i]);
            system.monitorHeartRate(ids[i], 72);
            system.monitorTemperature(ids[i], 98.6);
        }
        System.out.println("Final Health Report Generated.");
    }
}