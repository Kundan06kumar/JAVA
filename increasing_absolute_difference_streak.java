public class AbsoluteDiffStreak {
    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 10, 5, 7, 12};
        int count = 2, max = 2;

        for (int i = 2; i < arr.length; i++) {
            int prevDiff = Math.abs(arr[i - 1] - arr[i - 2]);
            int currDiff = Math.abs(arr[i] - arr[i - 1]);

            if (currDiff > prevDiff) {
                count++;
                max = Math.max(max, count);
            } else count = 2;
        }
        System.out.println("Increasing Absolute Difference Streak: " + max);
    }
}
