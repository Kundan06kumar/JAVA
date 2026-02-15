public class WordLengthParityStreak {
    public static void main(String[] args) {
        String[] words = {"hi", "to", "cat", "dog", "sun", "sky"};
        int count = 1, max = 1;

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() % 2 == words[i - 1].length() % 2)
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
