public class ConsecutiveEvenStreak {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 3, 10, 12};
        int count = 0, max = 0;

        for (int n : arr) {
            if (n % 2 == 0) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        System.out.println(max);
    }
}
