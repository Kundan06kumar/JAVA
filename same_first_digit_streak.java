public class FirstDigitStreak {

    static int firstDigit(int n) {
        while (n >= 10) n /= 10;
        return n;
    }

    public static void main(String[] args) {
        int[] arr = {123, 145, 199, 234, 256, 278};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (firstDigit(arr[i]) == firstDigit(arr[i - 1])) {
                count++;
                max = Math.max(max, count);
            } else count = 1;
        }
        System.out.println("Same First Digit Streak: " + max);
    }
}
