public class FuelCostCalculator {
    public static void main(String[] args) {
        double distance = 120; // km
        double mileage = 20;   // km/l
        double fuelPrice = 98; // ₹/l

        double fuelUsed = distance / mileage;
        double cost = fuelUsed * fuelPrice;

        System.out.println("Fuel Cost: ₹" + cost);
    }
}
