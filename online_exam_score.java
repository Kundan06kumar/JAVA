public class OnlineExam {
    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 2};
        int[] correct = {1, 2, 4, 4, 2};

        int score = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == correct[i])
                score += 2;
        }

        System.out.println("Exam Score: " + score + "/10");
    }
}
