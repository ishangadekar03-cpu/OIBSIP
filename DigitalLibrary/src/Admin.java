public class Admin {
    String username = "admin";
    String password = "admin123";

    public boolean login(String u, String p) {
        return username.equals(u) && password.equals(p);
    }
}
