import java.util.ArrayList;

public class MiniStatement {
    public static void main(String[] args) {
        ArrayList<Integer> transactions = new ArrayList<>();

        transactions.add(-500);
        transactions.add(2000);
        transactions.add(-300);
        transactions.add(1500);

        System.out.println("Bank Transactions:");

        for (int amount : transactions) {
            if (amount > 0) {
                System.out.println("Credit: ₹" + amount);
            } else {
                System.out.println("Debit: ₹" + (-amount));
            }
        }
    }
}
