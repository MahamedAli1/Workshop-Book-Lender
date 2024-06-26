package se.lexicon.model;

public class Book {
    private final String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    public Book(String title, String author) {
        this.id = java.util.UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.available = true;
        this.borrower = null;
    }

    public Book(String title, String author, Person borrower) {
        this(title, author);
        this.borrower = borrower;
        this.available = borrower == null;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Person getBorrower() {
        return borrower;
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
    }

    public String getBookInformation() {
        return "Book{id='" + id + "', title='" + title + "', author='" + author + "', available=" + available + ", borrower=" + (borrower != null ? borrower.getFirstName() + " " + borrower.getLastName() : "None") + '}';
    }


    public String toString() {
        return getBookInformation();
    }
}

