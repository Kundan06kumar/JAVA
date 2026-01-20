public class CharStreak {
    public static void main(String[] args) {

        String s = "aaabbccccdde";
        int max = 1, count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
        }

        System.out.println("Longest Character Streak: " + max);
    }
}
