public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 12, 18, 25, 31};
        int target = 18;

        int left = 0, right = numbers.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                result = mid;
                break;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Index: " + result);
    }
}