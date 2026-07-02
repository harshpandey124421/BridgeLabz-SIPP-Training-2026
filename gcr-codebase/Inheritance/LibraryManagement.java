class Book {
    private String title;
    private int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void displayDetails() {
        System.out.print("Title: " + title + ", Publication Year: " + publicationYear);
    }
}

class AuthoredBook extends Book {
    private String authorName;
    private String authorBio;

    public AuthoredBook(String title, int publicationYear, String authorName, String authorBio) {
        super(title, publicationYear);
        this.authorName = authorName;
        this.authorBio = authorBio;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorBio() {
        return authorBio;
    }

    public void setAuthorBio(String authorBio) {
        this.authorBio = authorBio;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(", Author: " + authorName + " - Bio: " + authorBio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        AuthoredBook book = new AuthoredBook("Java Fundamentals", 2023, "John Doe", "Senior Developer");
        book.displayDetails();
    }
}