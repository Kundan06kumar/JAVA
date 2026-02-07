public class MultipleStreak {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 3, 6, 12, 24};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % arr[i - 1] == 0) count++;
            else count = 1;
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
