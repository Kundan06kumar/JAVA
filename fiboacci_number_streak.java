public class FibonacciStreak {

    static boolean isFibonacci(int n) {
        int a = 0, b = 1;
        while (b < n) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b == n || n == 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 5, 4, 8, 13};
        int count = 0, max = 0;

        for (int n : arr) {
            if (isFibonacci(n)) {
                count++;
                max = Math.max(max, count);
            } else count = 0;
        }

        System.out.println("Longest Fibonacci Streak: " + max);
    }
}
