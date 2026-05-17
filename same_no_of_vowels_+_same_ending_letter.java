public class VowelEndingStreak {

    static int vowelCount(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray())
            if ("aeiou".indexOf(c) != -1)
                count++;
        return count;
    }

    public static void main(String[] args) {
        String[] arr = {"cake", "bike", "lake", "dog", "fog"};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            boolean sameVowel = vowelCount(arr[i]) == vowelCount(arr[i - 1]);
            boolean sameEnd = arr[i].charAt(arr[i].length() - 1) ==
                              arr[i - 1].charAt(arr[i - 1].length() - 1);

            if (sameVowel && sameEnd) count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
