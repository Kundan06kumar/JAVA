public class LastDigitStreak {
    public static void main(String[] args) {

        int[] arr = {21, 31, 41, 52, 62, 72};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 10 == arr[i - 1] % 10) {
                count++;
                max = Math.max(max, count);
            } else count = 1;
        }

        System.out.println("Longest Same Last Digit Streak: " + max);
    }
}
