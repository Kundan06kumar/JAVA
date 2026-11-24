import java.util.Stack;

public class BrowserHistory {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();

        history.push("google.com");
        history.push("github.com");
        history.push("stackoverflow.com");

        System.out.println("Current Page: " + history.peek());

        history.pop();

        System.out.println("After Back: " + history.peek());
    }
}
