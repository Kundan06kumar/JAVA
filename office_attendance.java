public class OfficeAttendance {
    public static void main(String[] args) {
        int present = 22;
        int workingDays = 24;

        double attendance = (present * 100.0) / workingDays;

        System.out.println("Attendance: " + attendance + "%");
    }
}
