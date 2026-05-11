public class DigitParityLengthStreak {

    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {12, 30, 42, 111, 123};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if ((digitSum(arr[i]) % 2 == digitSum(arr[i - 1]) % 2) &&
                (String.valueOf(arr[i]).length() == String.valueOf(arr[i - 1]).length())) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
