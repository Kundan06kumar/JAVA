public class SortedStreak {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 0, 4, 5, 6};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                count++;
                max = Math.max(max, count);
            } else count = 1;
        }

        System.out.println("Longest Sorted Streak: " + max);
    }
}
