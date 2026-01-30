public class DigitSumStreak {

    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 21, 45};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (digitSum(arr[i]) > digitSum(arr[i - 1])) {
                count++;
                max = Math.max(max, count);
            } else count = 1;
        }

        System.out.println("Longest Digit Sum Increasing Streak: " + max);
    }
}
