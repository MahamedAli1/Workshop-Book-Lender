package se.lexicon.model;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private static int sequencer = 0;
    private final int id;
    private String firstName;
    private String lastName;
    private final List<Book> booksLoaned;

    public Person(String firstName, String lastName) {
        this.id = getNextId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.booksLoaned = new ArrayList<>();
    }

    private static int getNextId() {
        return ++sequencer;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Book> getBooksLoaned() {
        return booksLoaned;
    }

    public void loanBook(Book book) {
        if (!booksLoaned.contains(book) && book.isAvailable()) {
            booksLoaned.add(book);
            book.setBorrower(this);
            book.setAvailable(false);
        }
    }

    public void returnBook(Book book) {
        if (booksLoaned.contains(book)) {
            booksLoaned.remove(book);
            book.setBorrower(null);
            book.setAvailable(true);
        }
    }

    public String getPersonInformation() {
        return "Person{id=" + id + ", name='" + firstName + " " + lastName + "', booksLoaned=" + booksLoaned + '}';
    }


    public String toString() {
        return getPersonInformation();
    }
}
