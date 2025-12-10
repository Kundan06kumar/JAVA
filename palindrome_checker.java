import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int rev = 0, temp = n;

        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (n == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
