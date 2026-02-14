public class DivisibleBySevenStreak {
    public static void main(String[] args) {
        int[] arr = {7, 14, 21, 5, 28, 35};
        int count = 0, max = 0;

        for (int n : arr) {
            if (n % 7 == 0) {
                count++;
                max = Math.max(max, count);
            } else count = 0;
        }
        System.out.println(max);
    }
}
