public class FirstTwoDigitsStreak {

    static int firstTwo(int n) {
        while (n >= 100) n /= 10;
        return n;
    }

    public static void main(String[] args) {
        int[] arr = {1234, 1256, 1299, 2345, 2399};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (firstTwo(arr[i]) == firstTwo(arr[i - 1]))
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
