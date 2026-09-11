public class BankTransfer {
    public static void main(String[] args) {
        double senderBalance = 25000;
        double receiverBalance = 10000;
        double amount = 5000;

        if (amount > 0 && amount <= senderBalance) {
            senderBalance -= amount;
            receiverBalance += amount;

            System.out.println("Transfer Successful");
            System.out.println("Sender Balance: ₹" + senderBalance);
            System.out.println("Receiver Balance: ₹" + receiverBalance);
        } else {
            System.out.println("Transfer Failed");
        }
    }
}
