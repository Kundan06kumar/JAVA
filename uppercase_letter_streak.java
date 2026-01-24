public class UppercaseStreak {
    public static void main(String[] args) {

        String s = "aaBBBCdEEEf";
        int count = 0, max = 0;

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        System.out.println("Longest Uppercase Streak: " + max);
    }
}
