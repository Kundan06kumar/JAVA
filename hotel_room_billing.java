public class HotelBill {
    public static void main(String[] args) {
        int nights = 4;
        double roomRate = 2500;
        double foodBill = 1800;

        double roomCost = nights * roomRate;
        double total = roomCost + foodBill;

        System.out.println("Room Cost: ₹" + roomCost);
        System.out.println("Food: ₹" + foodBill);
        System.out.println("Total Bill: ₹" + total);
    }
}
