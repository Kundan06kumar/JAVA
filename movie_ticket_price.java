public class MovieTicket {
    public static void main(String[] args) {
        int age = 16;
        int price = (age < 18) ? 150 : 250;

        System.out.println("Ticket Price: ₹" + price);
    }
}
