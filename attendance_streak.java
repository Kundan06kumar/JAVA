//p=present
public class AttendanceStreak {
    public static void main(String[] args) {

        String attendance = "PPPLPPPPPLP";
        int max = 0, current = 0;

        for (char c : attendance.toCharArray()) {
            if (c == 'P') {
                current++;
                max = Math.max(max, current);
            } else {
                current = 0;
            }
        }

        System.out.println("Longest Attendance Streak: " + max);
    }
}
