package Objects;

public class Account {
    private String username;
    private String password;
    private String message;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Account() {
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Account(String username, String password, String message) {
        this.username = username;
        this.password = password;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                '}';
    }
}
