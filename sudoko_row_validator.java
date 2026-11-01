import java.util.HashSet;

public class SudokuValidator {
    public static void main(String[] args) {
        int[] row = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        HashSet<Integer> seen = new HashSet<>();
        boolean valid = true;

        for (int number : row) {
            if (number < 1 || number > 9 || !seen.add(number)) {
                valid = false;
                break;
            }
        }

        System.out.println(
                valid ? "Valid Sudoku row" : "Invalid Sudoku row"
        );
    }
}