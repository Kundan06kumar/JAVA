public class SameCaseStreak {
    public static void main(String[] args) {
        String s = "aaBBCCddEEE";
        int count = 1, max = 1;

        for (int i = 1; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)) ==
                Character.isUpperCase(s.charAt(i - 1)))
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
