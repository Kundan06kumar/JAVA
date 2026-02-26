public class MiddleCharStreak {
    public static void main(String[] args) {
        String[] arr = {"cat", "bat", "hat", "dog", "fog"};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            char mid1 = arr[i].charAt(arr[i].length()/2);
            char mid2 = arr[i-1].charAt(arr[i-1].length()/2);

            if (mid1 == mid2) count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
