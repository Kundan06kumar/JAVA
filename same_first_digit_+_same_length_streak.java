public class FirstDigitAndLengthStreak {

    static int firstDigit(int n) {
        while (n >= 10) n /= 10;
        return n;
    }

    static int digitCount(int n) {
        return String.valueOf(n).length();
    }

    public static void main(String[] args) {
        int[] arr = {123, 145, 167, 234, 256};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (firstDigit(arr[i]) == firstDigit(arr[i - 1]) &&
                digitCount(arr[i]) == digitCount(arr[i - 1]))
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
