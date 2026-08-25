public class BookAvailability {
    public static void main(String[] args) {
        int totalBooks = 50;
        int issuedBooks = 47;

        int available = totalBooks - issuedBooks;

        System.out.println("Available Books: " + available);

        if (available == 0)
            System.out.println("Book Out of Stock");
    }
}
