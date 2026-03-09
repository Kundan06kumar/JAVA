public class ModuloThreeStreak {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 10, 13, 16};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 3 == arr[i - 1] % 3)
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
