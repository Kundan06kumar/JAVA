public class CountWords {
    public static void main(String[] args) {
        String sentence = "Java makes logic building strong";
        int count = 1;

        for(int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Total words: " + count);
    }
}
