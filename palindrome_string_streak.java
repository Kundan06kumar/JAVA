public class PalindromeStringStreak {

    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arr = {"madam", "level", "hello", "radar", "civic"};
        int count = 0, max = 0;

        for (String s : arr) {
            if (isPalindrome(s)) {
                count++;
                max = Math.max(max, count);
            } else count = 0;
        }
        System.out.println(max);
    }
}
