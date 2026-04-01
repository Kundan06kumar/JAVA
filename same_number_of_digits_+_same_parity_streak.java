public class DigitAndParityStreak {

    static int digitCount(int n) {
        return String.valueOf(n).length();
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 56, 123, 145, 167};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (digitCount(arr[i]) == digitCount(arr[i - 1]) &&
                arr[i] % 2 == arr[i - 1] % 2)
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
