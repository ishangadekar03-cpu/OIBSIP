import java.util.*;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public Library() {
        books.add(new Book(1, "Java Basics", "James Gosling"));
        books.add(new Book(2, "Data Structures", "Mark Allen"));
        books.add(new Book(3, "Operating Systems", "Silberschatz"));
    }

    public void showBooks() {
        System.out.println("\nAvailable Books:");
        for (Book b : books) {
            System.out.println(b.id + " | " + b.title + " | " + b.author +
                    " | Issued: " + b.issued);
        }
    }

    public void issueBook(int id) {
        for (Book b : books) {
            if (b.id == id && !b.issued) {
                b.issued = true;
                System.out.println("Book issued successfully.");
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(int id) {
        for (Book b : books) {
            if (b.id == id && b.issued) {
                b.issued = false;
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Invalid return.");
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }
}
