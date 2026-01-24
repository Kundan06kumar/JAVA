public class DifferenceStreak {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 2, 4, 6};
        int diff = arr[1] - arr[0];
        int count = 2, max = 2;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == diff) {
                count++;
                max = Math.max(max, count);
            } else {
                diff = arr[i] - arr[i - 1];
                count = 2;
            }
        }

        System.out.println("Longest Same Difference Streak: " + max);
    }
}
