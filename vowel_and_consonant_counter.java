public class VowelCounter {
    public static void main(String[] args) {
        String text = "Java is fun".toLowerCase();
        int vowels = 0, consonants = 0;

        for (char ch : text.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) >= 0) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}