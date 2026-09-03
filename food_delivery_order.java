public class FoodDelivery {
    public static void main(String[] args) {
        double foodAmount = 650;
        double deliveryFee = foodAmount >= 500 ? 0 : 40;

        double total = foodAmount + deliveryFee;

        System.out.println("Food: ₹" + foodAmount);
        System.out.println("Delivery: ₹" + deliveryFee);
        System.out.println("Total: ₹" + total);
    }
}
