public class PowerOfThreeStreak {

    static boolean isPowerOfThree(int n) {
        if (n < 1) return false;
        while (n % 3 == 0) n /= 3;
        return n == 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 9, 27, 2, 81};
        int count = 0, max = 0;

        for (int n : arr) {
            if (isPowerOfThree(n)) {
                count++;
                max = Math.max(max, count);
            } else count = 0;
        }
        System.out.println(max);
    }
}
