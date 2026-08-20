public class WaterBill {
    public static void main(String[] args) {
        int units = 120;
        double rate = 4.5;

        double bill = units * rate;

        System.out.println("Water Bill: ₹" + bill);
    }
}