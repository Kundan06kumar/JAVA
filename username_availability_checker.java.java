public class UsernameChecker {
    public static void main(String[] args) {
        String username = "kundan123";

        String[] existingUsers = {
            "rahul123",
            "amit456",
            "kundan123",
            "rohit789"
        };

        boolean available = true;

        for (String user : existingUsers) {
            if (user.equals(username)) {
                available = false;
                break;
            }
        }

        if (available) {
            System.out.println("Username Available");
        } else {
            System.out.println("Username Already Taken");
        }
    }
}
