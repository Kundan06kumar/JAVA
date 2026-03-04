public class ConsecutiveMultipleOfThreeStreak {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 2, 12, 15};
        int count = 0, max = 0;

        for (int n : arr) {
            if (n % 3 == 0) {
                count++;
                max = Math.max(max, count);
            } else count = 0;
        }
        System.out.println(max);
    }
}
