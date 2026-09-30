public class StudentMarks {
    public static void main(String[] args) {
        int[] marks = {78, 85, 92, 67, 88};

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        double average = (double) total / marks.length;

        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
    }
}
