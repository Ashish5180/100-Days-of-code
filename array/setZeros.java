public class setZeros {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean rowZero = false, colZero = false;

        // Check first row
        for (int j = 0; j < m; j++) {
            if (matrix[0][j] == 0) {
                rowZero = true;
                break;
            }
        }

        // Check first column
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                colZero = true;
                break;
            }
        }

        // Mark rows and columns to be zeroed
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Apply zeroes based on markers
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Handle first row
        if (rowZero) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // Handle first column
        if (colZero) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
