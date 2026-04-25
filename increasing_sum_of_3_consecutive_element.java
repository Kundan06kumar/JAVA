public class ThreeSumIncreasingStreak {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6};
        int count = 3, max = 3;

        for (int i = 3; i < arr.length; i++) {
            int prev = arr[i-1] + arr[i-2] + arr[i-3];
            int curr = arr[i] + arr[i-1] + arr[i-2];

            if (curr > prev)
                count++;
            else count = 3;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
