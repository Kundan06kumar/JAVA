public class ATM {
    public static void main(String[] args) {
        int balance = 5000;
        int withdraw = 1500;

        if (withdraw <= balance) {
            balance -= withdraw;
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
