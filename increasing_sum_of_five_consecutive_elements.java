public class FiveSumIncreasingStreak {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 2, 7, 8};
        int count = 5, max = 5;

        for (int i = 5; i < arr.length; i++) {
            int prev = arr[i-1] + arr[i-2] + arr[i-3] + arr[i-4] + arr[i-5];
            int curr = arr[i] + arr[i-1] + arr[i-2] + arr[i-3] + arr[i-4];

            if (curr > prev)
                count++;
            else count = 5;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
