public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int primary = 0;
        int secondary = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            primary += matrix[i][i];
            secondary += matrix[i][n - 1 - i];
        }

        System.out.println("Primary Diagonal: " + primary);
        System.out.println("Secondary Diagonal: " + secondary);
    }
}
