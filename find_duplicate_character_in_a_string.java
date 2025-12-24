import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
