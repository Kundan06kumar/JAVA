public class AlphabetOrderStreak {
    public static void main(String[] args) {
        String s = "abcdxyzab";
        int count = 1, max = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) > s.charAt(i - 1))
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
