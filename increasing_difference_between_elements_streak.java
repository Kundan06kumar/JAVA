public class IncreasingDifferenceStreak {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 10, 5, 8, 12};
        int count = 2, max = 2;

        for (int i = 2; i < arr.length; i++) {
            int prevDiff = arr[i - 1] - arr[i - 2];
            int currDiff = arr[i] - arr[i - 1];

            if (currDiff > prevDiff)
                count++;
            else count = 2;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
