import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user = new User("student", "1234");

        System.out.print("Enter Username: ");
        String u = sc.next();

        System.out.print("Enter Password: ");
        String p = sc.next();

        if (!user.login(u, p)) {
            System.out.println("Invalid Login!");
            return;
        }

        System.out.println("Login Successful!");

        while (true) {
            System.out.println("\n1. Update Profile");
            System.out.println("2. Start Exam");
            System.out.println("3. Logout");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter new password: ");
                user.updateProfile(sc.next());
            }

            else if (ch == 2) {
                Exam exam = new Exam();
                Timer timer = new Timer(30); 
                timer.start();

                exam.startExam();

                if (timer.isTimeUp()) {
                    exam.showResult();
                } else {
                    exam.showResult();
                }
            }

            else if (ch == 3) {
                System.out.println("Logged out successfully!");
                break;
            }
        }
        sc.close();
    }
}
