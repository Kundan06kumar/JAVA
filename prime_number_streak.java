public class PrimeStreak {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 7, 11, 13};
        int count = 0, max = 0;

        for (int n : arr) {
            if (isPrime(n)) {
                count++;
                max = Math.max(max, count);
            } else count = 0;
        }
        System.out.println("Longest Prime Streak: " + max);
    }
}
