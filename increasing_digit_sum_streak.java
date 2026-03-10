public class IncreasingDigitSumStreak {

    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {11, 23, 35, 14, 59};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (digitSum(arr[i]) > digitSum(arr[i - 1]))
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
