// Topic: Constructors - Library Book System
public class LibraryBookSystem {
    String title;
    String author;
    double price;
    boolean availability;

    public LibraryBookSystem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }

    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed.");
        } else {
            System.out.println("Book not available.");
        }
    }

    public static void main(String[] args) {
        LibraryBookSystem book = new LibraryBookSystem("1984", "Orwell", 15.0);
        book.borrowBook();
    }
}