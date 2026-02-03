public class SameLengthWordStreak {
    public static void main(String[] args) {

        String[] words = {"hi", "to", "by", "hello", "world", "again"};
        int count = 1, max = 1;

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() == words[i - 1].length()) {
                count++;
                max = Math.max(max, count);
            } else count = 1;
        }
        System.out.println("Same Length Word Streak: " + max);
    }
}
