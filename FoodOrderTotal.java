public class FoodOrder {
    public static void main(String[] args) {
        String[] items = {"Pizza", "Burger", "Cold Drink"};
        double[] prices = {250, 150, 80};

        double total = 0;

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " : ₹" + prices[i]);
            total += prices[i];
        }

        System.out.println("Total Bill: ₹" + total);
    }
}
