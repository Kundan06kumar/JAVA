public class SquareStreak {
    public static void main(String[] args) {

        int[] arr = {1, 4, 9, 16, 3, 25, 36};
        int count = 0, max = 0;

        for (int n : arr) {
            int root = (int) Math.sqrt(n);
            if (root * root == n) {
                count++;
                max = Math.max(max, count);
            } else count = 0;
        }

        System.out.println("Longest Perfect Square Streak: " + max);
    }
}
