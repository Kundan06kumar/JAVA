public class DivisibleByPreviousStreak {
    public static void main(String[] args) {

        int[] arr = {2, 4, 8, 16, 3, 6, 12};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % arr[i - 1] == 0) {
                count++;
                max = Math.max(max, count);
            } else count = 1;
        }

        System.out.println("Longest Divisible by Previous Streak: " + max);
    }
}
