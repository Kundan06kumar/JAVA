public class PowerOfTwoSequenceStreak {

    static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 3, 16, 32};
        int count = 0, max = 0;

        for (int n : arr) {
            if (isPowerOfTwo(n)) {
                count++;
                max = Math.max(max, count);
            } else count = 0;
        }
        System.out.println(max);
    }
}
