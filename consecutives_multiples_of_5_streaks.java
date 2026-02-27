public class MultipleOfFiveStreak {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 3, 20, 25};
        int count = 0, max = 0;

        for (int n : arr) {
            if (n % 5 == 0) {
                count++;
                max = Math.max(max, count);
            } else count = 0;
        }
        System.out.println(max);
    }
}
