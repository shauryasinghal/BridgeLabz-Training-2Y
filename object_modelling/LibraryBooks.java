
// Problem 1: Library and Books (Aggregation)
import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return title + " by " + author;
    }
}

class Library {
    private List<Book> books;

    Library() {
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }
}

public class LibraryBooks {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling");
        Book b2 = new Book("Effective Java", "Joshua Bloch");

        Library lib = new Library();
        lib.addBook(b1);
        lib.addBook(b2);

        System.out.println("Library books:");
        lib.showBooks();
    }
}
