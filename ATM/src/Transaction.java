import java.util.ArrayList;

public class Transaction {
    private ArrayList<String> history = new ArrayList<>();

    public void add(String message) {
        history.add(message);
    }

    public void show() {
        if (history.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("Transaction History:");
            for (String t : history) {
                System.out.println(t);
            }
        }
    }
}
