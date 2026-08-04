public class PharmacyDiscount {
    public static void main(String[] args) {
        double bill = 1800;

        if (bill >= 1500)
            bill -= bill * 0.10;

        System.out.println("Final Bill: ₹" + bill);
    }
}
