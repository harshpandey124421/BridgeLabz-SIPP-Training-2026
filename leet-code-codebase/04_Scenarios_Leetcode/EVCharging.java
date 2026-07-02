// Topic: Scenarios - Electric Vehicle Charging Network
public class EVCharging {
    static int totalStations = 0;
    static double electricityRate = 0.15;
    
    String stationId;
    double unitsConsumed;

    public EVCharging(String stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    public double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    public void displayStationDetails() {
        System.out.println("Station: " + stationId + " | Bill: $" + calculateBill());
    }

    public static void main(String[] args) {
        EVCharging[] stations = new EVCharging[5];
        for (int i = 0; i < 5; i++) {
            stations[i] = new EVCharging("S-" + (i+1), 100 + (i*10));
            stations[i].displayStationDetails();
        }
        
        electricityRate = 0.20;
        System.out.println("Rate changed.");
        stations[0].displayStationDetails();
    }
}