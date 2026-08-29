public class CabSurgeFare {
    public static void main(String[] args) {
        double baseFare = 300;
        double surgeMultiplier = 1.5;

        double finalFare = baseFare * surgeMultiplier;

        System.out.println("Final Cab Fare: ₹" + finalFare);
    }
}