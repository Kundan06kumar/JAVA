public class CinemaSeat {
    public static void main(String[] args) {
        int totalSeats = 100;
        int bookedSeats = 73;

        int available = totalSeats - bookedSeats;

        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Booked Seats: " + bookedSeats);
        System.out.println("Available Seats: " + available);
    }
}
