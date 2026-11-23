import java.util.Stack;

public class CartUndo {
    public static void main(String[] args) {
        Stack<String> cart = new Stack<>();

        cart.push("Laptop");
        cart.push("Mouse");
        cart.push("Keyboard");

        System.out.println("Cart: " + cart);

        String removed = cart.pop();

        System.out.println("Undo: Removed " + removed);
        System.out.println("Updated Cart: " + cart);
    }
}
