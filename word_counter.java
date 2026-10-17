import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine().trim();

        int count = text.isEmpty()
                ? 0 : text.split("\\s+").length;

        System.out.println("Total words: " + count);

        sc.close();
    }
}
