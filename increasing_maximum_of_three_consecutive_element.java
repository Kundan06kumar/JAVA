public class ThreeMaxStreak {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 6};
        int count = 3, max = 3;

        for (int i = 3; i < arr.length; i++) {
            int prev = Math.max(arr[i-1], Math.max(arr[i-2], arr[i-3]));
            int curr = Math.max(arr[i], Math.max(arr[i-1], arr[i-2]));

            if (curr > prev) count++;
            else count = 3;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
