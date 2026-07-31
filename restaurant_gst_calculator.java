public class RestaurantGST {
    public static void main(String[] args) {
        double bill = 1250;
        double gst = bill * 0.05;

        System.out.println("Final Bill: ₹" + (bill + gst));
    }
}
