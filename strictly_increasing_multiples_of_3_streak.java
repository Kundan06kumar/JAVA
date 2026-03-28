public class IncreasingMultipleOfThreeStreak {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 4, 12, 15};
        int count = 0, max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 &&
               (i == 0 || arr[i] > arr[i - 1])) {
                count++;
                max = Math.max(max, count);
            } else {
                count = (arr[i] % 3 == 0) ? 1 : 0;
            }
        }
        System.out.println(max);
    }
}
