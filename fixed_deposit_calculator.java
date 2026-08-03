public class FixedDeposit {
    public static void main(String[] args) {
        double principal = 100000;
        double rate = 6.5;
        int years = 3;

        double maturity = principal + (principal * rate * years / 100);

        System.out.println("Maturity Amount: ₹" + maturity);
    }
}
