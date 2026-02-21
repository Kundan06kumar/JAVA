import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for(int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Pop characters to reverse string
        String reversed = "";
        while(!stack.isEmpty()) {
            reversed += stack.pop();
        }

        System.out.println("Reversed String: " + reversed);
    }
}
