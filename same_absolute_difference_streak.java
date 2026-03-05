public class SameAbsoluteDiffStreak {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 3, 5, 7};
        int diff = Math.abs(arr[1] - arr[0]);
        int count = 2, max = 2;

        for (int i = 2; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) == diff) {
                count++;
                max = Math.max(max, count);
            } else {
                diff = Math.abs(arr[i] - arr[i - 1]);
                count = 2;
            }
        }
        System.out.println(max);
    }
}
