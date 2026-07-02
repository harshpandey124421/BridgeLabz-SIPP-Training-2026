// Topic: Scenarios - Space Tourism Reservation System
public class SpaceTourism {
    static int totalReservations = 0;
    static String missionName = "Mars Pioneer";
    
    String touristName;
    int seatNumber;

    public SpaceTourism(String touristName, int seatNumber) {
        this.touristName = touristName;
        this.seatNumber = seatNumber;
        totalReservations++;
    }

    public SpaceTourism updateSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
        return this;
    }

    public void displayDetails() {
        System.out.println(touristName + " | Seat: " + seatNumber + " | Mission: " + missionName);
    }

    public static void main(String[] args) {
        SpaceTourism t1 = new SpaceTourism("Elon", 1);
        t1.updateSeatNumber(10).updateSeatNumber(15);
        t1.displayDetails();
    }
}