public class ProductIncreasingStreak {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6};
        int count = 2, max = 2;

        for (int i = 2; i < arr.length; i++) {
            int prev = arr[i - 1] * arr[i - 2];
            int curr = arr[i] * arr[i - 1];

            if (curr > prev)
                count++;
            else count = 2;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
