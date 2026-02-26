public class PerfectCubeStreak {
    public static void main(String[] args) {
        int[] arr = {1, 8, 27, 4, 64, 125};
        int count = 0, max = 0;

        for (int n : arr) {
            int root = (int) Math.cbrt(n);
            if (root * root * root == n) {
                count++;
                max = Math.max(max, count);
            } else count = 0;
        }
        System.out.println(max);
    }
}
