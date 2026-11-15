public class PrimeRange {
    public static void main(String[] args) {
        int start = 10, end = 50;

        for (int n = start; n <= end; n++) {
            if (n < 2) continue;

            boolean prime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) System.out.print(n + " ");
        }
    }
}