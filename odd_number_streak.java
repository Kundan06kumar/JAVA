public class OddStreak {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 2, 7, 9, 11, 4};
        int count = 0, max = 0;

        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        System.out.println("Longest Odd Streak: " + max);
    }
}
