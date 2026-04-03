public class FirstLastDigitStreak {

    static boolean sameFirstLast(int n) {
        int last = n % 10;
        while (n >= 10) n /= 10;
        return n == last;
    }

    public static void main(String[] args) {
        int[] arr = {121, 131, 141, 23, 44, 55};
        int count = 0, max = 0;

        for (int n : arr) {
            if (sameFirstLast(n)) {
                count++;
                max = Math.max(max, count);
            } else count = 0;
        }
        System.out.println(max);
    }
}
