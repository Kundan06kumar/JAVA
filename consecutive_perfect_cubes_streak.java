public class ConsecutiveCubeStreak {
    public static void main(String[] args) {
        int[] arr = {1, 8, 27, 64, 9, 125};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (Math.cbrt(arr[i]) - Math.cbrt(arr[i - 1]) == 1)
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
