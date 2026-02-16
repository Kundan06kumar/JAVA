public class DivisibleByPrevPlusOneStreak {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 10, 11};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % (arr[i - 1] + 1) == 0)
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
