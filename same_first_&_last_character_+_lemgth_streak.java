public class FirstLastCharLengthStreak {
    public static void main(String[] args) {
        String[] arr = {"aba", "aca", "ada", "xyz", "pop", "mom"};
        int count = 0, max = 0;

        for (String s : arr) {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                count++;
                max = Math.max(max, count);
            } else count = 0;
        }
        System.out.println(max);
    }
}
