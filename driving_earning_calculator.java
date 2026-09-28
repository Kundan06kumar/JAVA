public class DriverEarnings {
    public static void main(String[] args) {
        int rides = 12;
        double earningPerRide = 180;
        double fuelExpense = 700;

        double totalEarning = rides * earningPerRide;
        double profit = totalEarning - fuelExpense;

        System.out.println("Total Earnings: ₹" + totalEarning);
        System.out.println("Fuel Expense: ₹" + fuelExpense);
        System.out.println("Net Earnings: ₹" + profit);
    }
}
