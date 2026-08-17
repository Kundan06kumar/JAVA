public class WithdrawalLimit {
    public static void main(String[] args) {
        double dailyLimit = 20000;
        double withdrawn = 15000;
        double request = 7000;

        if (withdrawn + request <= dailyLimit)
            System.out.println("Withdrawal Approved");
        else
            System.out.println("Daily Limit Exceeded");
    }
}
