public class CGPACalculator {
    public static void main(String[] args) {
        double[] sgpa = {8.2, 7.8, 8.5, 8.0};

        double total = 0;
        for (double s : sgpa)
            total += s;

        System.out.println("CGPA: " + total / sgpa.length);
    }
}
