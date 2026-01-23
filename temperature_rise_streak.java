public class TemperatureStreak {
    public static void main(String[] args) {

        int[] temp = {30, 32, 33, 31, 34, 35, 36};
        int current = 1, max = 1;

        for (int i = 1; i < temp.length; i++) {
            if (temp[i] > temp[i - 1]) {
                current++;
                max = Math.max(max, current);
            } else {
                current = 1;
            }
        }

        System.out.println("Longest Rising Temperature Streak: " + max);
    }
}
