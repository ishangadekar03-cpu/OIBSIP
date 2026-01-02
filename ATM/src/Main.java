import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User user = new User("intern", 4321);
        BankAccount account = new BankAccount(10000);
        Transaction transaction = new Transaction();
        ATM atm = new ATM(account, transaction);

        System.out.print("Enter User ID: ");
        String id = sc.next();

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (user.authenticate(id, pin)) {
            System.out.println("Login Successful!");
            atm.start();
        } else {
            System.out.println("Invalid credentials!");
        }

        sc.close();
    }
}
