public class ASCIIStreak {
    public static void main(String[] args) {

        String s = "ACEGBCDF";
        int count = 1, max = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) > s.charAt(i - 1)) {
                count++;
                max = Math.max(max, count);
            } else count = 1;
        }

        System.out.println("Longest ASCII Increasing Streak: " + max);
    }
}
