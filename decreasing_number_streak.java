public class DecreasingStreak {
    public static void main(String[] args) {
        int[] arr = {9, 7, 5, 3, 8, 6, 4};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) count++;
            else count = 1;
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
