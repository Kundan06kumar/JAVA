public class StudentResult {
    public static void main(String[] args) {
        int[] marks = {78, 85, 69, 91, 74};

        int total = 0;
        boolean pass = true;

        for (int mark : marks) {
            total += mark;
            if (mark < 33)
                pass = false;
        }

        double percentage = total / (double) marks.length;

        System.out.println("Percentage: " + percentage + "%");
        System.out.println(pass ? "PASS" : "FAIL");
    }
}
