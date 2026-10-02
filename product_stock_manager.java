import java.util.HashMap;

public class ProductStock {
    public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<>();

        stock.put("Laptop", 10);
        stock.put("Mouse", 25);
        stock.put("Keyboard", 15);

        System.out.println("Product Stock:");

        for (String product : stock.keySet()) {
            System.out.println(product + " : " + stock.get(product));
        }
    }
}
