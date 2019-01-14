import util.Input;

public class User {
    private String username;
    private String password;
    private int numberOfSuccessfulLogins;
    private int numberOfFailedLogins;

    private static int numberOfUsers = 0;
    private boolean isLoggedIn = false;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        numberOfFailedLogins = 0;
        numberOfSuccessfulLogins = 0;
        numberOfUsers++;
    }

    public void changePassword(String password) {
        if(this.password.equals(password)) {
            Input input = new Input();
            String newPassword = input.getString("Please input your new password");
            this.password = newPassword;
            System.out.println("Your password has been changed.");
        } else {
            System.out.println("Password did not match. Please try again.");

        }
    }

    public void wait5minues() {
        System.out.println("Five minutes passes... tick tock...");
        numberOfFailedLogins = 0;
        System.out.println("Five minutes has passed. You may now attempt to login.");
    }

    public void login(String username, String password) {
        if(this.username.equals(username) && this.password.equals(password)) {
            numberOfSuccessfulLogins++;
            System.out.println("Welcome!");
            System.out.println("You have been successfully logged in!");
        } else {
            numberOfFailedLogins++;
        }
    }

    public void logout() {
        if(isLoggedIn) {
            isLoggedIn = false;
            System.out.println("You have been logged out.");
        } else {
            System.out.println("User is not logged in.");
        }
    }

    public static int getNumberOfUsers() {
        return numberOfUsers;
    }
}
