public class TriangularNumberStreak {

    static boolean isTriangular(int n) {
        int sum = 0, i = 1;
        while (sum < n) {
            sum += i++;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 10, 2, 15, 21};
        int count = 0, max = 0;

        for (int n : arr) {
            if (isTriangular(n)) {
                count++;
                max = Math.max(max, count);
            } else count = 0;
        }
        System.out.println(max);
    }
}
