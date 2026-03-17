public class SameEndingCharStreak {
    public static void main(String[] args) {
        String[] words = {"cat", "bat", "rat", "dog", "fog"};
        int count = 1, max = 1;

        for (int i = 1; i < words.length; i++) {
            if (words[i].charAt(words[i].length() - 1) ==
                words[i - 1].charAt(words[i - 1].length() - 1))
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
