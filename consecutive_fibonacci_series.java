public class FibonacciSequenceStreak {

    static boolean isFibo(int a, int b, int c) {
        return a + b == c;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 5, 4, 8, 13};
        int count = 2, max = 2;

        for (int i = 2; i < arr.length; i++) {
            if (isFibo(arr[i - 2], arr[i - 1], arr[i]))
                count++;
            else count = 2;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
