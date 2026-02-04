public class SetBitStreak {

    static int countBits(int n) {
        return Integer.bitCount(n);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 8, 15, 31};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (countBits(arr[i]) > countBits(arr[i - 1])) {
                count++;
                max = Math.max(max, count);
            } else count = 1;
        }
        System.out.println("Increasing Set-Bit Streak: " + max);
    }
}
