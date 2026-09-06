public class LibraryIssue {
    public static void main(String[] args) {
        int availableBooks = 8;
        boolean memberActive = true;

        if (memberActive && availableBooks > 0) {
            availableBooks--;
            System.out.println("Book Issued Successfully");
            System.out.println("Books Left: " + availableBooks);
        } else {
            System.out.println("Cannot Issue Book");
        }
    }
}
