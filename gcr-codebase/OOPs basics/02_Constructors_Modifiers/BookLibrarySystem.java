// Topic: Access Modifiers - Book Library System
class BookAccess {
    public String isbn;
    protected String title;
    private String author;

    public BookAccess(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
}

class EBook extends BookAccess {
    public EBook(String isbn, String title, String author) {
        super(isbn, title, author);
    }
    public void show() {
        System.out.println("ISBN: " + isbn + ", Title: " + title);
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        EBook ebook = new EBook("123-4", "Java", "James");
        ebook.show();
    }
}