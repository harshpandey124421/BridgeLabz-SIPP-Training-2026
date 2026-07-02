import java.util.*;

public class Q7_SmartCityTrafficMonitoringSystem {
    static HashMap<String, Integer> roadTraffic = new HashMap<>();

    static void addOrUpdateRoad(String roadName, int vehicleCount) {
        roadTraffic.put(roadName, roadTraffic.getOrDefault(roadName, 0) + vehicleCount);
        System.out.println(roadName + " updated with " + vehicleCount + " vehicles.");
    }

    static void displaySorted() {
        TreeMap<String, Integer> sortedMap = new TreeMap<>(roadTraffic);
        System.out.println("Roads in sorted order:");
        for (String road : sortedMap.keySet()) {
            System.out.println(road + " : " + sortedMap.get(road));
        }
    }

    static void findBusiestRoad() {
        String busiest = null;
        int maxCount = -1;
        for (String road : roadTraffic.keySet()) {
            if (roadTraffic.get(road) > maxCount) {
                maxCount = roadTraffic.get(road);
                busiest = road;
            }
        }
        System.out.println("Busiest road: " + busiest + " with " + maxCount + " vehicles.");
    }

    static void generateReport() {
        System.out.println("Traffic Report:");
        for (String road : roadTraffic.keySet()) {
            System.out.println(road + " -> " + roadTraffic.get(road) + " vehicles");
        }
        System.out.println("Total roads monitored: " + roadTraffic.size());
    }

    public static void main(String[] args) {
        addOrUpdateRoad("MG Road", 150);
        addOrUpdateRoad("Ring Road", 320);
        addOrUpdateRoad("Station Road", 90);
        addOrUpdateRoad("Ring Road", 50);

        System.out.println();
        displaySorted();

        System.out.println();
        findBusiestRoad();

        System.out.println();
        generateReport();
    }
}
