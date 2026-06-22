public class MobileRecharge {
    public static void main(String[] args) {
        double balance = 50;
        double rechargePlan = 199;

        if (balance >= rechargePlan)
            System.out.println("Recharge Successful");
        else
            System.out.println("Insufficient Balance");
    }
}
