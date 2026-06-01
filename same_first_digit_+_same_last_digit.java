public class FirstLastDigitMatchStreak {

    static int firstDigit(int n) {
        while (n >= 10) n /= 10;
        return n;
    }

    public static void main(String[] args) {
        int[] arr = {121, 131, 141, 252, 262};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            boolean sameFirst =
                firstDigit(arr[i]) == firstDigit(arr[i - 1]);

            boolean sameLast =
                arr[i] % 10 == arr[i - 1] % 10;

            if (sameFirst && sameLast) {
                count++;
            } else {
                count = 1;
            }

            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}
