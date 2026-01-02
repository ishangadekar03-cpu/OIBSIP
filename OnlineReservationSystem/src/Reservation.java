import java.util.*;

public class Reservation {
    private static Map<String, User> reservations = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void reserveTicket() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Train Number: ");
        String trainNumber = sc.nextLine();

        String trainName = "Express Train";

        System.out.print("Enter Class Type: ");
        String classType = sc.nextLine();

        System.out.print("From: ");
        String from = sc.nextLine();

        System.out.print("To: ");
        String to = sc.nextLine();

        System.out.print("Journey Date (DD/MM/YYYY): ");
        String date = sc.nextLine();

        String pnr = generatePNR();

        User user = new User(name, age, trainNumber, trainName, classType, from, to, date, pnr);
        reservations.put(pnr, user);

        System.out.println("\nTicket Reserved Successfully!");
        user.displayDetails();
    }

    private static String generatePNR() {
        return "PNR" + (100000 + new Random().nextInt(900000));
    }

    public static User getReservation(String pnr) {
        return reservations.get(pnr);
    }

    public static void cancelReservation(String pnr) {
        reservations.remove(pnr);
    }
}
