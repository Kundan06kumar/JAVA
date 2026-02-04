public class GreaterStreak {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 6, 8};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) count++;
            else count = 1;
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
