public class UppercaseCountStreak {

    static int upperCount(String s) {
        int count = 0;
        for (char c : s.toCharArray())
            if (Character.isUpperCase(c))
                count++;
        return count;
    }

    public static void main(String[] args) {
        String[] arr = {"AA", "BB", "cc", "DD", "EE"};
        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (upperCount(arr[i]) ==
                upperCount(arr[i - 1]))
                count++;
            else count = 1;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
