public class VowelAndFirstLetterStreak {

    static int vowelCount(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray())
            if ("aeiou".indexOf(c) != -1)
                count++;
        return count;
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "angle", "arrow", "bat", "ball"};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (vowelCount(arr[i]) == vowelCount(arr[i - 1]) &&
                arr[i].charAt(0) == arr[i - 1].charAt(0))
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
