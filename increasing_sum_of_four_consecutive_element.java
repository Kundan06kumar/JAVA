public class FourSumIncreasingStreak {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 6, 7};
        int count = 4, max = 4;

        for (int i = 4; i < arr.length; i++) {
            int prev = arr[i-1] + arr[i-2] + arr[i-3] + arr[i-4];
            int curr = arr[i] + arr[i-1] + arr[i-2] + arr[i-3];

            if (curr > prev)
                count++;
            else count = 4;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
