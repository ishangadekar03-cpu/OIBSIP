import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login login = new Login();

        System.out.println("Welcome to Online Reservation System\n");

        if (!login.authenticate()) {
            return;
        }

        while (true) {
            System.out.println("\n1. Reserve Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Reservation.reserveTicket();
                    break;
                case 2:
                    Cancellation.cancelTicket();
                    break;
                case 3:
                    System.out.println("Thank you for using the system.");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
