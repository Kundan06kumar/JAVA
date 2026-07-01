public class HospitalBill {
    public static void main(String[] args) {
        double consultationFee = 500;
        double medicineCost = 1250;
        double labTest = 800;

        double totalBill = consultationFee + medicineCost + labTest;

        System.out.println("Hospital Bill: ₹" + totalBill);
    }
}
