public class IncreasingPrimeStreak {

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 4, 11, 13};
        int count = 0, max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i]) &&
               (i == 0 || arr[i] > arr[i - 1])) {
                count++;
                max = Math.max(max, count);
            } else {
                count = isPrime(arr[i]) ? 1 : 0;
            }
        }
        System.out.println(max);
    }
}
