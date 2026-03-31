public class IncreasingRatioStreak {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 3, 6, 12};
        int count = 2, max = 2;

        for (int i = 2; i < arr.length; i++) {
            double prev = (double) arr[i - 1] / arr[i - 2];
            double curr = (double) arr[i] / arr[i - 1];

            if (curr > prev)
                count++;
            else count = 2;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
