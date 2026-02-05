public class SameSignStreak {
    public static void main(String[] args) {
        int[] arr = {2, 4, -1, -3, -5, 6};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] >= 0 && arr[i - 1] >= 0) ||
                (arr[i] < 0 && arr[i - 1] < 0))
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
