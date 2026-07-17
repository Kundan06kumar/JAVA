public class PatientBMI {
    public static void main(String[] args) {
        double weight = 68;
        double height = 1.72;

        double bmi = weight / (height * height);

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else
            System.out.println("Overweight");
    }
}
