public class DivisibleByDigitSumStreak {

    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {12, 18, 20, 21, 24};
        int count = 0, max = 0;

        for (int n : arr) {
            if (n % digitSum(n) == 0) {
                count++;
                max = Math.max(max, count);
            } else count = 0;
        }
        System.out.println(max);
    }
}
