public class BankTransaction {
    public static void main(String[] args) {
        double balance = 25000;
        double deposit = 5000;
        double withdrawal = 3000;

        balance += deposit;

        if (withdrawal <= balance)
            balance -= withdrawal;

        System.out.println("Final Balance: ₹" + balance);
    }
}
