//same word repeated
public class WordStreak {
    public static void main(String[] args) {

        String[] words = {"hi", "hi", "hello", "hello", "hello", "bye"};
        int max = 1, count = 1;

        for (int i = 1; i < words.length; i++) {
            if (words[i].equals(words[i - 1])) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
        }

        System.out.println("Longest Word Streak: " + max);
    }
}
