public class AlternateEvenOddStreak {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6, 7, 8};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2) != (arr[i - 1] % 2)) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
        }

        System.out.println("Longest Alternate Even-Odd Streak: " + max);
    }
}
