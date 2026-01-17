public class WordCount {
    public static void main(String[] args) {
        String sentence = "Java developer in making";
        int count = sentence.trim().split("\\s+").length;

        System.out.println("Word Count: " + count);
    }
}
