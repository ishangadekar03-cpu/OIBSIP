public class User {
    private String userId;
    private int pin;

    public User(String userId, int pin) {
        this.userId = userId;
        this.pin = pin;
    }

    public boolean authenticate(String id, int enteredPin) {
        return userId.equals(id) && pin == enteredPin;
    }
}
