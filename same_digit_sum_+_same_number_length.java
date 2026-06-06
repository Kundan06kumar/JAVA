public class DigitSumLengthStreak {

    static int digitSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {123, 222, 321, 45, 54};

        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {

            boolean sameSum =
                digitSum(arr[i]) == digitSum(arr[i - 1]);

            boolean sameLength =
                String.valueOf(arr[i]).length() ==
                String.valueOf(arr[i - 1]).length();

            if (sameSum && sameLength) {
                count++;
            } else {
                count = 1;
            }

            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}
