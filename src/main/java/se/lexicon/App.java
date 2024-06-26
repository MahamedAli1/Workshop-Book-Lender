package se.lexicon;


import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {

        // Create a book instance
        Book book1 = new Book("1984", "George Orwell");
        System.out.println("Book information: " + book1.getBookInformation());

        // Create a person instance
        Person person1 = new Person("Mohamed", "Ali");
        System.out.println("Person information: " + person1.getPersonInformation());

        // Loan a book to the person
        person1.loanBook(book1);

        // Display person information after borrowing a book
        System.out.println("Person information after borrowing a book: " + person1.getPersonInformation());
        // Display book information after borrowing a book
        System.out.println("Book information after borrowing a book: " + book1.getBookInformation());

        // Return the borrowed book
        person1.returnBook(book1);

        // Display person information after returning the book
        System.out.println("Person information after returning the book: " + person1.getPersonInformation());
        // Display book information after returning the book
        System.out.println("Book information after returning the book: " + book1.getBookInformation());
    }
}
