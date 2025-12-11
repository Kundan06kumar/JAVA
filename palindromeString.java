import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(rev.equals(s) ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}
