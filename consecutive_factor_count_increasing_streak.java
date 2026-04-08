public class FactorCountIncreasingStreak {

    static int factorCount(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 12, 24};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (factorCount(arr[i]) > factorCount(arr[i - 1]))
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
