class RescueTeam {
    String teamId;
    String location;

    public RescueTeam(String teamId, String location) {
        this.teamId = teamId;
        this.location = location;
    }

    public void performDuty() {
        System.out.println("Generic team standby deployment configuration active.");
    }
}

class MedicalTeam extends RescueTeam {
    public MedicalTeam(String id, String loc) {
        super(id, loc);
    }

    @Override
    public void performDuty() {
        System.out.println("Medical Team [" + teamId + "] at " + location + ": Providing trauma triage care.");
    }
}

class FireRescueTeam extends RescueTeam {
    public FireRescueTeam(String id, String loc) {
        super(id, loc);
    }

    @Override
    public void performDuty() {
        System.out.println("Fire Rescue Team [" + teamId + "] at " + location + ": Extracting structural hazards.");
    }
}

class FoodSupplyTeam extends RescueTeam {
    public FoodSupplyTeam(String id, String loc) {
        super(id, loc);
    }

    @Override
    public void performDuty() {
        System.out.println("Food Supply Team [" + teamId + "] at " + location + ": Delivering fresh dry rations.");
    }
}

public class DisasterRescueManagementSystem {
    public static void main(String[] args) {
        RescueTeam[] deployments = {
            new MedicalTeam("MED-01", "Sector North"),
            new FoodSupplyTeam("FOOD-01", "Sector West"),
            new FireRescueTeam("FIRE-01", "Sector North"),
            new MedicalTeam("MED-02", "Sector South"),
            new MedicalTeam("MED-03", "Sector East")
        };
        int medCount = 0, fireCount = 0, foodCount = 0;
        for (RescueTeam r : deployments) {
            r.performDuty();
            if (r instanceof MedicalTeam) medCount++;
            else if (r instanceof FireRescueTeam) fireCount++;
            else if (r instanceof FoodSupplyTeam) foodCount++;
        }
        System.out.println("\nDeployment Density Statistics:");
        System.out.println("Medical Teams Deployed: " + medCount);
        System.out.println("Fire Rescue Teams Deployed: " + fireCount);
        System.out.println("Food Supply Teams Deployed: " + foodCount);
        int maxVal = Math.max(medCount, Math.max(fireCount, foodCount));
        System.out.print("Category with Maximum Deployments Concentration: ");
        if (maxVal == medCount) System.out.println("Medical Infrastructure Team");
        else if (maxVal == fireCount) System.out.println("Fire Rescue Force");
        else System.out.println("Food Logistics Supply Team");
    }
}