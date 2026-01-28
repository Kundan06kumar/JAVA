public class PalindromeStreak {

    static boolean isPalindrome(int n) {
        int temp = n, rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == n;
    }

    public static void main(String[] args) {
        int[] arr = {121, 131, 20, 44, 55};
        int count = 0, max = 0;

        for (int n : arr) {
            if (isPalindrome(n)) {
                count++;
                max = Math.max(max, count);
            } else count = 0;
        }

        System.out.println("Longest Palindrome Streak: " + max);
    }
}
