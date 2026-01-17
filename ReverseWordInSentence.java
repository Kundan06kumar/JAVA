public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "I am learning Java";
        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
