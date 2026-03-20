public class SecondDigitStreak {

    static int secondDigit(int n) {
        return (n / 10) % 10;
    }

    public static void main(String[] args) {
        int[] arr = {123, 153, 183, 245, 275};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (secondDigit(arr[i]) == secondDigit(arr[i - 1]))
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
