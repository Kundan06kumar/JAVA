public class ThirdDigitStreak {

    static int thirdDigit(int n) {
        return (n / 100) % 10;
    }

    public static void main(String[] args) {
        int[] arr = {123, 153, 183, 245, 275};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (thirdDigit(arr[i]) == thirdDigit(arr[i - 1]))
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
