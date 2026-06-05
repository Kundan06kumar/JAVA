public class SunnyNumberStreak {

    static boolean isSunny(int n) {
        int root = (int)Math.sqrt(n + 1);
        return root * root == n + 1;
    }

    public static void main(String[] args) {

        int[] arr = {3, 8, 15, 10, 24};

        int count = 0, max = 0;

        for (int n : arr) {
            if (isSunny(n)) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        System.out.println(max);
    }
}
