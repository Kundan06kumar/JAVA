public class CreditLimit {
    public static void main(String[] args) {
        double limit = 50000;
        double spent = 42000;

        if (spent <= limit)
            System.out.println("Transaction Allowed");
        else
            System.out.println("Limit Exceeded");
    }
}
