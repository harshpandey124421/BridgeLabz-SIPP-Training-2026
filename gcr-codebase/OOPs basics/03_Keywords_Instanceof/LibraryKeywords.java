// Topic: Keywords - Library Management System
public class LibraryKeywords {
    static String libraryName = "City Library";
    final String isbn;
    String title;
    String author;

    public LibraryKeywords(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    public static void main(String[] args) {
        LibraryKeywords book = new LibraryKeywords("978-3", "1984", "Orwell");
        if (book instanceof LibraryKeywords) {
            displayLibraryName();
            System.out.println(book.title + " by " + book.author);
        }
    }
}