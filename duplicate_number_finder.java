import java.util.HashSet;

public class DuplicateFinder {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 20, 40, 10, 50};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int number : numbers) {
            if (!seen.add(number)) {
                duplicates.add(number);
            }
        }

        System.out.println("Duplicate numbers: " + duplicates);
    }
}
