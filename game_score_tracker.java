public class GameScore {
    public static void main(String[] args) {
        int[] scores = {120, 150, 200, 180};

        int total = 0;
        for (int score : scores)
            total += score;

        System.out.println("Total Score: " + total);
    }
}
