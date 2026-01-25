public class WordLengthStreak {
    public static void main(String[] args) {

        String[] words = {"a", "to", "you", "them", "people", "hi"};
        int current = 1, max = 1;

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > words[i - 1].length()) {
                current++;
                max = Math.max(max, current);
            } else {
                current = 1;
            }
        }

        System.out.println("Longest Word Length Streak: " + max);
    }
}
