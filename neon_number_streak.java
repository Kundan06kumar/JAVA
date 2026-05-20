public class NeonStreak {

    static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 2, 1};
        int count = 0, max = 0;

        for (int n : arr) {
            if (isNeon(n)) {
                count++;
                max = Math.max(max, count);
            } else count = 0;
        }
        System.out.println(max);
    }
}
