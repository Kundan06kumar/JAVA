//letter,digit
public class CharTypeStreak {
    public static void main(String[] args) {

        String s = "abc12345de67";
        int count = 1, max = 1;

        for (int i = 1; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) &&
                Character.isDigit(s.charAt(i - 1)) ||
                Character.isLetter(s.charAt(i)) &&
                Character.isLetter(s.charAt(i - 1))) {

                count++;
                max = Math.max(max, count);
            } else count = 1;
        }

        System.out.println("Longest Same Character-Type Streak: " + max);
    }
}
