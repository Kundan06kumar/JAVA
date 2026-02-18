public class SameVowelCountStreak {

    static int vowelCount(String s) {
        int count = 0;
        for (char c : s.toCharArray())
            if ("aeiou".indexOf(c) != -1)
                count++;
        return count;
    }

    public static void main(String[] args) {
        String[] arr = {"cat", "dog", "sun", "moon", "tree"};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (vowelCount(arr[i]) == vowelCount(arr[i - 1]))
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
