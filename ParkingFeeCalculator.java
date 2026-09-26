public class ParkingFee {
    public static void main(String[] args) {
        int hours = 5;
        int fee;

        if (hours <= 2) {
            fee = 30;
        } else if (hours <= 5) {
            fee = 60;
        } else {
            fee = 100;
        }

        System.out.println("Parking Hours: " + hours);
        System.out.println("Parking Fee: ₹" + fee);
    }
}
