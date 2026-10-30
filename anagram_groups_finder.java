import java.util.*;

public class AnagramGroups {
    public static void main(String[] args) {
        String[] words = {"listen", "silent", "hello", "enlist", "world"};

        Map<String, List<String>> groups = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            groups.computeIfAbsent(key, k -> new ArrayList<>())
                  .add(word);
        }

        for (List<String> group : groups.values()) {
            if (group.size() > 1) {
                System.out.println(group);
            }
        }
    }
}
