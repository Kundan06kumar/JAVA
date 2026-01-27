public class SumStreak {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 3, 5, 9, 1};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] + arr[i - 1] > arr[i - 1]) {
                count++;
                max = Math.max(max, count);
            } else count = 1;
        }

        System.out.println("Longest Sum Increasing Streak: " + max);
    }
}
