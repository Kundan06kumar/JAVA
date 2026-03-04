public class LastTwoDigitsStreak {
    public static void main(String[] args) {
        int[] arr = {121, 221, 321, 145, 245, 345};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 100 == arr[i - 1] % 100)
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
