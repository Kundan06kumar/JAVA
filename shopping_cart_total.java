public class ShoppingCart {
    public static void main(String[] args) {
        double[] prices = {499, 899, 299};

        double total = 0;

        for(double price : prices)
            total += price;

        System.out.println("Cart Total: ₹" + total);
    }
}
