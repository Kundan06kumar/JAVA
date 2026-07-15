public class ATMPinVerification {
    public static void main(String[] args) {
        int savedPin = 1234;
        int enteredPin = 1234;

        if (savedPin == enteredPin)
            System.out.println("Access Granted");
        else
            System.out.println("Invalid PIN");
    }
}
