public class LastCharStreak {
    public static void main(String[] args) {
        String[] arr = {"cat", "bat", "rat", "dog", "fog", "log"};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].charAt(arr[i].length()-1) ==
                arr[i - 1].charAt(arr[i - 1].length()-1))
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
