public class EmployeeAttendance {
    public static void main(String[] args) {
        int present = 23;
        int totalDays = 26;

        double percentage = present * 100.0 / totalDays;

        System.out.println("Attendance: " + percentage + "%");
        System.out.println(percentage >= 75 ? "Eligible" : "Low Attendance");
    }
}
