public class LoginSystem {
    public static void main(String[] args) {
        String savedUser = "admin";
        String savedPassword = "java123";

        String username = "admin";
        String password = "java123";

        if (savedUser.equals(username) &&
            savedPassword.equals(password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }
    }
}
