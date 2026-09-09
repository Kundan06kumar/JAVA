public class ProductSearch {
    public static void main(String[] args) {
        String[] products = {
            "Laptop", "Mouse", "Keyboard", "Monitor"
        };

        String search = "Keyboard";
        boolean found = false;

        for (String product : products) {
            if (product.equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Product Found" : "Product Not Found");
    }
}
