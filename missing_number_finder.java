public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 6};

        int n = 6;
        int expected = n * (n + 1) / 2;
        int actual = 0;

        for (int num : numbers) {
            actual += num;
        }

        System.out.println("Missing Number: " + (expected - actual));
    }
}
