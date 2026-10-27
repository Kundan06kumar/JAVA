import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {
    public static void main(String[] args) {
        Map<Character, String> morse = new HashMap<>();

        morse.put('S', "...");
        morse.put('O', "---");
        morse.put(' ', "/");

        String message = "SOS";
        StringBuilder result = new StringBuilder();

        for (char ch : message.toUpperCase().toCharArray()) {
            result.append(morse.getOrDefault(ch, "?")).append(" ");
        }

        System.out.println("Message: " + message);
        System.out.println("Morse: " + result.toString().trim());
    }
}
