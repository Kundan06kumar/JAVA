public class AdjacentSumStreak {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 6, 7};
        int count = 2, max = 2;

        for (int i = 2; i < arr.length; i++) {
            int prevSum = arr[i - 1] + arr[i - 2];
            int currSum = arr[i] + arr[i - 1];

            if (currSum > prevSum)
                count++;
            else count = 2;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
