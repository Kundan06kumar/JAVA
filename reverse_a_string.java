import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String rev = "";

        for(int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }

        System.out.println("Reversed: " + rev);
    }
}
