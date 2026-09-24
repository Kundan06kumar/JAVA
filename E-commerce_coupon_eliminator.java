public class CouponValidator {
    public static void main(String[] args) {
        String coupon = "SAVE20";
        double amount = 1500;

        if (coupon.equals("SAVE20") && amount >= 1000) {
            double discount = amount * 0.20;
            System.out.println("Discount: ₹" + discount);
            System.out.println("Final Amount: ₹" + (amount - discount));
        } else {
            System.out.println("Coupon not applicable");
        }
    }
}
