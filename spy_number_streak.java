public class SpyNumberStreak {

    static boolean isSpy(int n) {
        int sum = 0, product = 1;

        while (n > 0) {
            int d = n % 10;
            sum += d;
            product *= d;
            n /= 10;
        }
        return sum == product;
    }

    public static void main(String[] args) {
        int[] arr = {1124, 123, 22, 1412};
        int count = 0, max = 0;

        for (int n : arr) {
            if (isSpy(n)) {
                count++;
                max = Math.max(max, count);
            } else count = 0;
        }

        System.out.println(max);
    }
}
