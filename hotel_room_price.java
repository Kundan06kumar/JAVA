public class HotelRoom {
    public static void main(String[] args) {
        String roomType = "Deluxe";
        int days = 3;
        int pricePerDay;

        if (roomType.equals("Standard")) {
            pricePerDay = 1500;
        } else if (roomType.equals("Deluxe")) {
            pricePerDay = 2500;
        } else {
            pricePerDay = 4000;
        }

        int total = pricePerDay * days;

        System.out.println("Room: " + roomType);
        System.out.println("Days: " + days);
        System.out.println("Total Bill: ₹" + total);
    }
}
