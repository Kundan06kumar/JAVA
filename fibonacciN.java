//Print first N Fibonacci numbers
import java.util.Scanner;

public class FibonacciN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i==n ? "" : " "));
            int c = a + b;
            a = b; b = c;
        }
        System.out.println();
        sc.close();
    }
}
