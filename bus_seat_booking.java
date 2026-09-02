public class BusBooking {
    public static void main(String[] args) {
        int totalSeats = 40;
        int bookedSeats = 37;
        int requestedSeats = 2;

        int available = totalSeats - bookedSeats;

        if (requestedSeats <= available) {
            bookedSeats += requestedSeats;
            System.out.println("Booking Confirmed");
            System.out.println("Available Seats: " +
                    (totalSeats - bookedSeats));
        } else {
            System.out.println("Seats Not Available");
        }
    }
}
