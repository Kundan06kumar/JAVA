public class LastDigitLengthStreak {

    static int digitCount(int n) {
        return String.valueOf(n).length();
    }

    public static void main(String[] args) {
        int[] arr = {12, 22, 32, 145, 255};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 10 == arr[i - 1] % 10 &&
                digitCount(arr[i]) == digitCount(arr[i - 1])) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
