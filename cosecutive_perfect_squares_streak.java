public class ConsecutiveSquareStreak {
    public static void main(String[] args) {
        int[] arr = {1, 4, 9, 16, 5, 25, 36};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (Math.sqrt(arr[i]) - Math.sqrt(arr[i - 1]) == 1)
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
