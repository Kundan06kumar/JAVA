public class IncreasingEvenStreak {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 8, 10};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] > arr[i - 1])
                count++;
            else count = (arr[i] % 2 == 0) ? 1 : 0;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
