public class TrainFare {
    public static void main(String[] args) {
        double distance = 250;
        double farePerKm = 1.8;

        double totalFare = distance * farePerKm;

        System.out.println("Train Fare: ₹" + totalFare);
    }
}
