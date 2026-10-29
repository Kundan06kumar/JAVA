public class TournamentScore {
    public static void main(String[] args) {
        String[] player1 = {"rock", "paper", "scissors", "rock"};
        String[] player2 = {"scissors", "rock", "paper", "rock"};

        int p1 = 0, p2 = 0, draws = 0;

        for (int i = 0; i < player1.length; i++) {
            String a = player1[i];
            String b = player2[i];

            if (a.equals(b)) {
                draws++;
            } else if (
                    (a.equals("rock") && b.equals("scissors")) ||
                    (a.equals("paper") && b.equals("rock")) ||
                    (a.equals("scissors") && b.equals("paper"))
            ) {
                p1++;
            } else {
                p2++;
            }
        }

        System.out.println("Player 1 wins: " + p1);
        System.out.println("Player 2 wins: " + p2);
        System.out.println("Draws: " + draws);
    }
}
