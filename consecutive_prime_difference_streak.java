public class PrimeDifferenceStreak {

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 10, 11, 13};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (isPrime(arr[i]) && isPrime(arr[i - 1]))
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
