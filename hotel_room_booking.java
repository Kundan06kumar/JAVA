public class HotelBooking {
    public static void main(String[] args) {
        int availableRooms = 5;
        int requestedRooms = 2;

        if (requestedRooms <= availableRooms)
            System.out.println("Booking Confirmed");
        else
            System.out.println("Rooms Not Available");
    }
}
