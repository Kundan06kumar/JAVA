public class IncreasingStreak {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 1, 2, 3};
        int current = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                current++;
                max = Math.max(max, current);
            } else {
                current = 1;
            }
        }

        System.out.println("Longest Increasing Streak: " + max);
    }
}
