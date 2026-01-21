public class BinaryStreak {
    public static void main(String[] args) {

        int n = 110111011;
        int max = 0, count = 0;

        while (n > 0) {
            if (n % 10 == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
            n /= 10;
        }

        System.out.println("Longest 1s Streak: " + max);
    }
}
