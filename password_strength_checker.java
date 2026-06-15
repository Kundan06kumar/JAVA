public class PasswordChecker {
    public static void main(String[] args) {
        String password = "Java12345";

        if (password.length() >= 8)
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");
    }
}
