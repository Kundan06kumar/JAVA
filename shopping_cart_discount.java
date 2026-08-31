public class CartDiscount {
    public static void main(String[] args) {
        double[] prices = {799, 1299, 499, 999};

        double total = 0;

        for (double price : prices)
            total += price;

        double discount = total >= 3000 ? total * 0.15 : total * 0.05;
        double finalAmount = total - discount;

        System.out.println("Total: ₹" + total);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + finalAmount);
    }
}
