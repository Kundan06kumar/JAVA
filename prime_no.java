import java.util.Scanner;

class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();   

        System.out.println("Prime numbers from 1 to " + n + ":");

        for (int num = 2; num <= n; num++) {

            int count = 0;

            // count divisors of num
            for (int i = 1; i <= num; i++) {

                if (num % i == 0) {
                    count++;
                }
            }

            // if-else to decide prime
            if (count == 2) {
                System.out.print(num + " ");
            }
            else {
                // do nothing
            }
        }

        sc.close();
    }
}
// second method using if else
class Program {
    public static void main(String[] args) {

        System.out.println("Prime numbers from 1 to 100:");

        for (int num = 2; num <= 100; num++) {   // start from 2 (1 is not prime)
            boolean isPrime = true;

            // check factors from 2 to num-1
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;   // number is not prime
                    break;
                }
            }

            // print only if prime
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
