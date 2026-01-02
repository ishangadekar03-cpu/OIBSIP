import java.util.Scanner;

public class Login {
    private final String USER_ID = "admin";
    private final String PASSWORD = "1234";

    public boolean authenticate() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User ID: ");
        String userId = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (userId.equals(USER_ID) && password.equals(PASSWORD)) {
            System.out.println("Login Successful!\n");
            return true;
        } else {
            System.out.println("Invalid Credentials. Access Denied.");
            return false;
        }
    }
}
