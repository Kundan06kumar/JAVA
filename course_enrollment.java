public class CourseEnrollment {
    public static void main(String[] args) {
        int capacity = 50;
        int enrolled = 47;

        if (enrolled < capacity) {
            System.out.println("Enrollment Available");
            System.out.println("Seats Left: " + (capacity - enrolled));
        } else {
            System.out.println("Course is Full");
        }
    }
}
