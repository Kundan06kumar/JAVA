public class ProductStreak {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 1, 5};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] * arr[i - 1] > arr[i - 1])
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
