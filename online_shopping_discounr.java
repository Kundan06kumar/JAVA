public class ShoppingDiscount {
    public static void main(String[] args) {
        double amount = 5000;

        if (amount > 3000)
            amount *= 0.9;

        System.out.println("Final Amount: ₹" + amount);
    }
}
