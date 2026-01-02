import java.util.Scanner;

public class ATM {
    private BankAccount account;
    private Transaction transaction;
    private Scanner sc = new Scanner(System.in);

    public ATM(BankAccount account, Transaction transaction) {
        this.account = account;
        this.transaction = transaction;
    }

    public void start() {
        int choice;
        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    transaction.show();
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double w = sc.nextDouble();
                    if (account.withdraw(w)) {
                        transaction.add("Withdrawn: ₹" + w);
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    double d = sc.nextDouble();
                    account.deposit(d);
                    transaction.add("Deposited: ₹" + d);
                    System.out.println("Deposit successful.");
                    break;

                case 4:
                    System.out.print("Enter amount: ");
                    double t = sc.nextDouble();
                    if (account.transfer(t)) {
                        transaction.add("Transferred: ₹" + t);
                        System.out.println("Transfer successful.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using ATM.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }
}
