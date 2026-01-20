public class StreakCounter {
    public static void main(String[] args) {

        int[] arr = {1, 2, -1, 3, 4, 5, -2, 6, 7};
        int currentStreak = 0;
        int maxStreak = 0;

        for (int num : arr) {
            if (num > 0) {
                currentStreak++;
                maxStreak = Math.max(maxStreak, currentStreak);
            } else {
                currentStreak = 0;
            }
        }

        System.out.println("Longest Positive Streak: " + maxStreak);
    }
}
