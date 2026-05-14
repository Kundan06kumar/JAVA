public class SuffixTwoStreak {
    public static void main(String[] args) {
        String[] arr = {"walking", "talking", "baking", "cat", "bat"};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            String a = arr[i].substring(arr[i].length() - 2);
            String b = arr[i - 1].substring(arr[i - 1].length() - 2);

            if (a.equals(b)) count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
