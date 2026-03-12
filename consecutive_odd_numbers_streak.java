public class ConsecutiveOddStreak {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 2, 9, 11};
        int count = 0, max = 0;

        for (int n : arr) {
            if (n % 2 != 0) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        System.out.println(max);
    }
}
