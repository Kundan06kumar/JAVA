public class StartingLetterStreak {
    public static void main(String[] args) {
        String[] words = {"apple", "ant", "arrow", "bat", "ball", "cat"};
        int count = 1, max = 1;

        for (int i = 1; i < words.length; i++) {
            if (words[i].charAt(0) == words[i - 1].charAt(0))
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
