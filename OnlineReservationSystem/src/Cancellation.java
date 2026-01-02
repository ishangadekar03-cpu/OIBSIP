import java.util.Scanner;

public class Cancellation {
    private static Scanner sc = new Scanner(System.in);

    public static void cancelTicket() {
        System.out.print("Enter PNR Number: ");
        String pnr = sc.nextLine();

        User user = Reservation.getReservation(pnr);

        if (user == null) {
            System.out.println("No reservation found for given PNR.");
            return;
        }

        user.displayDetails();

        System.out.print("Confirm cancellation (Y/N): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("Y")) {
            Reservation.cancelReservation(pnr);
            System.out.println("Ticket Cancelled Successfully.");
        } else {
            System.out.println("Cancellation Aborted.");
        }
    }
}
