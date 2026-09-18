public class SalaryTax {
    public static void main(String[] args) {
        double salary = 75000;
        double taxRate;

        if (salary <= 30000)
            taxRate = 0.05;
        else if (salary <= 60000)
            taxRate = 0.10;
        else
            taxRate = 0.15;

        double tax = salary * taxRate;
        double netSalary = salary - tax;

        System.out.println("Tax: ₹" + tax);
        System.out.println("Net Salary: ₹" + netSalary);
    }
}
