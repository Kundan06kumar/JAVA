public class GreaterThanTenStreak {
    public static void main(String[] args) {
        int[] arr = {11, 15, 20, 5, 30, 40};
        int count = 0, max = 0;

        for (int n : arr) {
            if (n > 10) {
                count++;
                max = Math.max(max, count);
            } else count = 0;
        }
        System.out.println(max);
    }
}
