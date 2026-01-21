public class EvenStreak {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 1, 8, 10, 12};
        int count = 0, max = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        System.out.println("Longest Even Streak: " + max);
    }
}
