// Find duplicates in an integer array
import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 2, 5};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();
        for (int x : arr) {
            if (!seen.add(x)) dup.add(x);
        }
        if (dup.isEmpty()) System.out.println("No duplicates");
        else System.out.println("Duplicates: " + dup);
    }
}
