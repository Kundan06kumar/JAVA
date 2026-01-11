import java.util.*;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String s = "programming";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for(char c : map.keySet()) {
            if(map.get(c) == 1) {
                System.out.println("First Unique: " + c);
                break;
            }
        }
    }
}
