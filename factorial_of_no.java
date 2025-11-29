import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int fact = 1;

        for(int i = 1; i <= n; i++){
            fact *= i;
        }

        System.out.println("Factorial = " + fact);
    }
}
//(Example: 5! = 5 × 4 × 3 × 2 × 1)
