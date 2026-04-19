public class FibonacciDiffStreak {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 5, 3, 8, 13};
        int count = 2, max = 2;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + arr[i - 2])
                count++;
            else count = 2;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
