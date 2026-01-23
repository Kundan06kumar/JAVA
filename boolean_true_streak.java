public class BooleanStreak {
    public static void main(String[] args) {

        boolean[] arr = {true, true, false, true, true, true};
        int count = 0, max = 0;

        for (boolean b : arr) {
            if (b) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        System.out.println("Longest TRUE Streak: " + max);
    }
}
