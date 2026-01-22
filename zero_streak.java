public class ZeroStreak {
    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 0, 0, 0, 2};
        int count = 0, max = 0;

        for (int num : arr) {
            if (num == 0) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        System.out.println("Longest Zero Streak: " + max);
    }
}
