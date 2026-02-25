public class ConsecutiveOddStreak {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 9, 11, 13};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 2)
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
