public class Invoice {
    public static void main(String[] args) {
        String product = "Keyboard";
        int quantity = 2;
        double price = 800;

        double subtotal = quantity * price;
        double gst = subtotal * 0.18;
        double total = subtotal + gst;

        System.out.println("----- INVOICE -----");
        System.out.println("Product: " + product);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: ₹" + subtotal);
        System.out.println("GST (18%): ₹" + gst);
        System.out.println("Total: ₹" + total);
    }
}
