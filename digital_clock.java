import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();

        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("hh:mm:ss a");

        System.out.println("Current Time: " + time.format(format));
    }
}
