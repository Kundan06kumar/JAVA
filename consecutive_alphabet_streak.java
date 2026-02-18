public class ReverseAlphabetStreak {
    public static void main(String[] args) {
        String s = "zyxwvab";
        int count = 1, max = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1) - 1)
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
