public class VowelConsonantStreak {

    static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        String s = "aaeeiobcdfg";
        int count = 1, max = 1;

        for (int i = 1; i < s.length(); i++) {
            if (isVowel(s.charAt(i)) == isVowel(s.charAt(i - 1)))
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
