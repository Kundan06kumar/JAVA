public class ConsonantCountStreak {

    static int consonantCount(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetter(c) &&
               "aeiou".indexOf(c) == -1)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] arr = {"cat", "moon", "tree", "sky"};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (consonantCount(arr[i]) >
                consonantCount(arr[i - 1]))
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
