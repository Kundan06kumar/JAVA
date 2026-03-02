public class DivisibleByFourStreak {
    public static void main(String[] args) {
        int[] arr = {4, 8, 12, 3, 16, 20};
        int count = 0, max = 0;

        for (int n : arr) {
            if (n % 4 == 0) {
                count++;
                max = Math.max(max, count);
            } else count = 0;
        }
        System.out.println(max);
    }
}
