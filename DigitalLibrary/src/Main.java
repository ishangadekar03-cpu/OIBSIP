import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        Admin admin = new Admin();

        System.out.println("1. Admin Login");
        System.out.println("2. User Access");
        System.out.print("Select role: ");
        int role = sc.nextInt();

        if (role == 1) {
            System.out.print("Username: ");
            String u = sc.next();
            System.out.print("Password: ");
            String p = sc.next();

            if (admin.login(u, p)) {
                System.out.println("Admin Login Successful!");
                library.addBook(new Book(4, "Computer Networks", "Tanenbaum"));
                library.showBooks();
            } else {
                System.out.println("Invalid Admin Credentials");
            }

        } else if (role == 2) {
            System.out.print("Enter user name: ");
            User user = new User(sc.next());

            library.showBooks();
            System.out.print("Enter book ID to issue: ");
            library.issueBook(sc.nextInt());

            System.out.print("Enter book ID to return: ");
            library.returnBook(sc.nextInt());
        }

        sc.close();
    }
}
