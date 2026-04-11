public class IncreasingMultipleOfSevenStreak {
    public static void main(String[] args) {
        int[] arr = {7, 14, 21, 5, 28, 35};
        int count = 0, max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 7 == 0 &&
               (i == 0 || arr[i] > arr[i - 1])) {
                count++;
                max = Math.max(max, count);
            } else {
                count = (arr[i] % 7 == 0) ? 1 : 0;
            }
        }
        System.out.println(max);
    }
}
