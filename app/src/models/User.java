package models;

public class User {
    private static int userId;
    private String username;
    private String password;

    public User(String password, String username) {
        this.password = password;
        userId++;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public int getUserId() {
        return userId;
    }



    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
