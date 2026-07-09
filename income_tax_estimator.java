public class IncomeTax {
    public static void main(String[] args) {
        double annualIncome = 800000;
        double taxRate = 0.10;

        double tax = annualIncome * taxRate;

        System.out.println("Estimated Tax: ₹" + tax);
    }
}
