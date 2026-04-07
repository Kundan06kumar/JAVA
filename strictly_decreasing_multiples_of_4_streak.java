public class DecreasingMultipleOfFourStreak {
    public static void main(String[] args) {
        int[] arr = {16, 12, 8, 4, 3, 20};
        int count = 0, max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 4 == 0 &&
               (i == 0 || arr[i] < arr[i - 1])) {
                count++;
                max = Math.max(max, count);
            } else {
                count = (arr[i] % 4 == 0) ? 1 : 0;
            }
        }
        System.out.println(max);
    }
}
