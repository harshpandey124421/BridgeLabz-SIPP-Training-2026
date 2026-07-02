// Topic: Constructors - Hotel Booking System
public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    public HotelBooking() {
        this("Guest", "Standard", 1);
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking("John", "Deluxe", 3);
        HotelBooking h2 = new HotelBooking(h1);
    }
}