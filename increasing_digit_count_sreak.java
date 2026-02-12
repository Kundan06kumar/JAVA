public class DigitCountStreak {

    static int digitCount(int n) {
        return String.valueOf(n).length();
    }

    public static void main(String[] args) {
        int[] arr = {1, 12, 123, 45, 6789};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (digitCount(arr[i]) > digitCount(arr[i - 1]))
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}

