public class AbsoluteValueStreak {
    public static void main(String[] args) {
        int[] arr = {-1, -3, -6, 2, 5, 9};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(arr[i - 1]))
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
