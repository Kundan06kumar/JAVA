import java.security.SecureRandom;

public class OTPGenerator {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        int otp = 100000 + random.nextInt(900000);

        System.out.println("Your OTP: " + otp);
    }
}
