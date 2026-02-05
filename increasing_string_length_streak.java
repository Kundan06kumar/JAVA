public class StringLengthStreak {
    public static void main(String[] args) {
        String[] arr = {"a", "ab", "abc", "hi", "hello", "welcome"};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > arr[i - 1].length())
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
