public class InventoryAlert {
    public static void main(String[] args) {
        String[] products = {"Laptop", "Mouse", "Keyboard", "Monitor"};
        int[] stock = {8, 25, 5, 12};

        for (int i = 0; i < products.length; i++) {
            if (stock[i] < 10)
                System.out.println("Low Stock: " + products[i]);
        }
    }
}
