// Topic: Constructors - Book Class Default & Parameterized
public class BookConstructors {
    String title;
    String author;
    double price;

    public BookConstructors() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public BookConstructors(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        BookConstructors b1 = new BookConstructors();
        BookConstructors b2 = new BookConstructors("Java 101", "Smith", 29.99);
    }
}