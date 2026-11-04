public class LoginMonitor {
    public static void main(String[] args) {
        boolean[] loginSuccess = {
                false, false, false, true, false, false
        };

        int failedAttempts = 0;

        for (boolean success : loginSuccess) {
            if (success) {
                failedAttempts = 0;
            } else {
                failedAttempts++;
            }

            if (failedAttempts >= 3) {
                System.out.println("Alert: 3 consecutive failures!");
                break;
            }
        }
    }
}
