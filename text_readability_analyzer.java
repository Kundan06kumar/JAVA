public class ReadabilityAnalyzer {
    public static void main(String[] args) {
        String text = "Java is easy. Practice makes you better.";

        int words = text.trim().split("\\s+").length;
        int sentences = text.split("[.!?]+").length;

        double average = (double) words / sentences;

        System.out.println("Words: " + words);
        System.out.println("Sentences: " + sentences);
        System.out.printf("Average words per sentence: %.2f%n", average);
    }
}