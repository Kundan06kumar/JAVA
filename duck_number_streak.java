public class DuckStreak {

    static boolean isDuck(int n) {
        return String.valueOf(n).contains("0") &&
               !String.valueOf(n).startsWith("0");
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 101, 5, 209};
        int count = 0, max = 0;

        for (int n : arr) {
            if (isDuck(n)) {
                count++;
                max = Math.max(max, count);
            } else count = 0;
        }
        System.out.println(max);
    }
}
