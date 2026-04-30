public class PerfectNumberStreak {

    static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++)
            if (n % i == 0) sum += i;
        return sum == n;
    }

    public static void main(String[] args) {
        int[] arr = {6, 28, 496, 10, 8128};
        int count = 0, max = 0;

        for (int n : arr) {
            if (isPerfect(n)) {
                count++;
                max = Math.max(max, count);
            } else count = 0;
        }
        System.out.println(max);
    }
}
