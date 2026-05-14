public class HarshadStreak {

    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static boolean isHarshad(int n) {
        return n % digitSum(n) == 0;
    }

    public static void main(String[] args) {
        int[] arr = {18, 21, 24, 25, 36};
        int count = 0, max = 0;

        for (int n : arr) {
            if (isHarshad(n)) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        System.out.println(max);
    }
}
