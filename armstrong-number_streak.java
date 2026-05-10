public class ArmstrongStreak {

    static boolean isArmstrong(int n) {
        int temp = n, sum = 0, digits = String.valueOf(n).length();

        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int[] arr = {153, 370, 371, 10, 407};
        int count = 0, max = 0;

        for (int n : arr) {
            if (isArmstrong(n)) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        System.out.println(max);
    }
}
