public class ParkingManager {
    public static void main(String[] args) {
        boolean[] slots = {
            true, false, true, false, false
        };

        int available = 0;

        for (boolean occupied : slots) {
            if (!occupied)
                available++;
        }

        System.out.println("Available Slots: " + available);
    }
}
