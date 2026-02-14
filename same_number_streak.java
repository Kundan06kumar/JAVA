public class ExactMatchStreak {
    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 2, 2, 3, 3, 3, 3};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
