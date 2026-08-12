public class GSTCalculator {
    public static void main(String[] args) {
        double amount = 2500;
        double gstRate = 18;

        double gst = amount * gstRate / 100;

        System.out.println("GST: ₹" + gst);
        System.out.println("Total: ₹" + (amount + gst));
    }
}
