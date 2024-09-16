package Practice;

public class LibrarySystem {
    public static void main(String[] args) {
        // Create an author
        Author author = new Author("J.K. Rowling", "jk.rowling@example.com");

        // Create a book with the author
        Book book = new Book("Harry Potter and the Philosopher's Stone", author);

        // Display book information
        book.display();

    }
}
