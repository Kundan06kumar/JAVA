public class EmployeeRating {
    public static void main(String[] args) {
        int performanceScore = 87;

        if (performanceScore >= 90) {
            System.out.println("Rating: Excellent");
        } else if (performanceScore >= 75) {
            System.out.println("Rating: Very Good");
        } else if (performanceScore >= 60) {
            System.out.println("Rating: Good");
        } else {
            System.out.println("Rating: Needs Improvement");
        }
    }
}
