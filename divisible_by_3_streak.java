public class DivisibleByThreeStreak {
    public static void main(String[] args) {

        int[] arr = {3, 6, 9, 4, 12, 15};
        int count = 0, max = 0;

        for (int num : arr) {
            if (num % 3 == 0) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        System.out.println("Longest Divisible by 3 Streak: " + max);
    }
}
