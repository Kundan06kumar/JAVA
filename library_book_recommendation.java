import java.util.ArrayList;
import java.util.List;

public class BookRecommendation {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();

        books.add("Java Programming");
        books.add("Python Basics");
        books.add("Data Structures");
        books.add("Database Management");

        String interest = "Java";

        System.out.println("Recommended Books:");

        for (String book : books) {
            if (book.toLowerCase().contains(interest.toLowerCase())) {
                System.out.println(book);
            }
        }
    }
}
