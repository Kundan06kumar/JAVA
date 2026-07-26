public class EventBooking {
    public static void main(String[] args) {
        int seatsAvailable = 100;
        int tickets = 4;

        if (tickets <= seatsAvailable)
            System.out.println("Tickets Booked");
        else
            System.out.println("Booking Failed");
    }
}
