//Example: 123 → 1 + 2 + 3 = 6
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int sum = 0;

        while(n > 0){
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}
