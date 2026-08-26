public class DoctorAppointment {
    public static void main(String[] args) {
        String type = "Specialist";

        int fee;

        if (type.equals("General"))
            fee = 300;
        else if (type.equals("Specialist"))
            fee = 700;
        else
            fee = 1000;

        System.out.println("Consultation Fee: ₹" + fee);
    }
}
