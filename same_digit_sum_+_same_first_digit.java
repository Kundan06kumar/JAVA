public class DigitSumFirstDigitStreak {

    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int firstDigit(int n) {
        while (n >= 10) n /= 10;
        return n;
    }

    public static void main(String[] args) {
        int[] arr = {123, 132, 141, 245, 254};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (digitSum(arr[i]) == digitSum(arr[i - 1]) &&
                firstDigit(arr[i]) == firstDigit(arr[i - 1])) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
