public class NegativeStreak {
    public static void main(String[] args) {

        int[] arr = {-1, -2, -3, 4, -5, -6};
        int count = 0, max = 0;

        for (int num : arr) {
            if (num < 0) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        System.out.println("Longest Negative Streak: " + max);
    }
}
