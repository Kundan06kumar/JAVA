public class FirstThreeCharStreak {
    public static void main(String[] args) {
        String[] arr = {"apple", "application", "apply", "bat", "ball"};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].substring(0, 3)
                .equals(arr[i - 1].substring(0, 3)))
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
