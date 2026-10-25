import java.util.Scanner;

public class TypingSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = "Java makes problem solving fun";

        System.out.println("Type this sentence:");
        System.out.println(sentence);
        System.out.println("Press Enter when ready.");
        sc.nextLine();

        long start = System.nanoTime();

        String typed = sc.nextLine();

        long end = System.nanoTime();

        double minutes = (end - start) / 60_000_000_000.0;
        int words = typed.trim().isEmpty()
                ? 0 : typed.trim().split("\\s+").length;

        double wpm = minutes > 0 ? words / minutes : 0;

        System.out.printf("Typing Speed: %.2f WPM%n", wpm);
        System.out.println(
                typed.equals(sentence) ? "Exact match!" : "Text differs."
        );

        sc.close();
    }
}
