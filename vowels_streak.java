public class VowelStreak {
    public static void main(String[] args) {

        String s = "aeioubcdfaaei";
        int max = 0, count = 0;

        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        System.out.println("Longest Vowel Streak: " + max);
    }
}
