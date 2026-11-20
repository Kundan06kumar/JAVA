import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalendarFinder {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, 11, 17);

        System.out.println("Date: " +
                date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

        System.out.println("Day: " + date.getDayOfWeek());
        System.out.println("Day of Year: " + date.getDayOfYear());
    }
}