public class DeliveryTracker {
    public static void main(String[] args) {
        String[] statuses = {
            "Order Placed",
            "Packed",
            "Shipped",
            "Out for Delivery",
            "Delivered"
        };

        int currentStatus = 3;

        System.out.println("Current Status: " +
                statuses[currentStatus]);

        if (currentStatus == statuses.length - 1)
            System.out.println("Order Completed");
        else
            System.out.println("Order In Progress");
    }
}
