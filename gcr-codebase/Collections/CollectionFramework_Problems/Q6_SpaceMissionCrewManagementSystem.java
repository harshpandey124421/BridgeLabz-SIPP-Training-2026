import java.util.*;

class Astronaut {
    String astronautId;
    String name;
    String specialization;

    Astronaut(String astronautId, String name, String specialization) {
        this.astronautId = astronautId;
        this.name = name;
        this.specialization = specialization;
    }
}

public class Q6_SpaceMissionCrewManagementSystem {
    static HashMap<String, List<Astronaut>> missionCrew = new HashMap<>();
    static HashMap<String, HashSet<String>> missionAssignedIds = new HashMap<>();

    static void addMission(String missionName) {
        missionCrew.putIfAbsent(missionName, new ArrayList<>());
        missionAssignedIds.putIfAbsent(missionName, new HashSet<>());
        System.out.println("Mission added: " + missionName);
    }

    static void assignAstronaut(String missionName, Astronaut astronaut) {
        if (!missionCrew.containsKey(missionName)) {
            System.out.println("Mission not found: " + missionName);
            return;
        }
        HashSet<String> assignedIds = missionAssignedIds.get(missionName);
        if (assignedIds.contains(astronaut.astronautId)) {
            System.out.println(astronaut.name + " already assigned to " + missionName);
            return;
        }
        missionCrew.get(missionName).add(astronaut);
        assignedIds.add(astronaut.astronautId);
        System.out.println(astronaut.name + " assigned to " + missionName);
    }

    static void displayMissions() {
        for (String mission : missionCrew.keySet()) {
            System.out.println("Mission: " + mission);
            List<Astronaut> crew = missionCrew.get(mission);
            for (Astronaut a : crew) {
                System.out.println("  " + a.astronautId + " " + a.name + " " + a.specialization);
            }
            System.out.println("Total astronauts: " + crew.size());
        }
    }

    public static void main(String[] args) {
        addMission("Chandrayaan-4");
        addMission("Gaganyaan-2");

        Astronaut a1 = new Astronaut("A101", "Rakesh", "Pilot");
        Astronaut a2 = new Astronaut("A102", "Sunita", "Engineer");
        Astronaut a3 = new Astronaut("A103", "Vikram", "Scientist");

        assignAstronaut("Chandrayaan-4", a1);
        assignAstronaut("Chandrayaan-4", a2);
        assignAstronaut("Chandrayaan-4", a1);
        assignAstronaut("Gaganyaan-2", a3);
        assignAstronaut("Gaganyaan-2", a1);

        System.out.println();
        displayMissions();
    }
}
