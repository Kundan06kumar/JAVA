public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 45, 23, 89, 54};

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > max) {
                second = max;
                max = n;
            } else if (n > second && n != max) {
                second = n;
            }
        }

        System.out.println("Second Largest: " + second);
    }
}
