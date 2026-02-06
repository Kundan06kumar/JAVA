public class RepeatingDigitStreak {
    public static void main(String[] args) {
        int n = 111223333445;
        int prev = -1, count = 0, max = 0;

        while (n > 0) {
            int d = n % 10;
            if (d == prev) count++;
            else count = 1;
            max = Math.max(max, count);
            prev = d;
            n /= 10;
        }
        System.out.println(max);
    }
}
