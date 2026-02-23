public class CountVowels {

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "Kundan Kumar";
        System.out.println("Vowel Count: " + countVowels(input));
    }
}
