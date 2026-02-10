public class TensDigitStreak {

    static int tensDigit(int n) {
        return (n / 10) % 10;
    }

    public static void main(String[] args) {
        int[] arr = {12, 15, 19, 22, 25, 29};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (tensDigit(arr[i]) == tensDigit(arr[i - 1]))
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
