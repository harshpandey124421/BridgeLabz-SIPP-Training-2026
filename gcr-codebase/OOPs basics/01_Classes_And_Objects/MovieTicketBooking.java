// Topic: Classes and Objects - Level 2: Movie Ticket Booking System
public class MovieTicketBooking {
    private String movieName;
    private int seatNumber;
    private double price;

    public MovieTicketBooking(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.seatNumber = -1; 
    }

    public void bookTicket(int seatNumber) {
        this.seatNumber = seatNumber;
        this.price += 5.0; 
    }

    public void displayDetails() {
        System.out.println("Movie: " + movieName + ", Seat: " + seatNumber + ", Price: $" + price);
    }

    public static void main(String[] args) {
        MovieTicketBooking ticket = new MovieTicketBooking("Inception", 12.0);
        ticket.bookTicket(42);
        ticket.displayDetails();
    }
}