package question_051;

public class Q073_Set_Matrix_Zeroes {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return;

        int row = matrix.length, col = matrix[0].length;
        boolean topZero = false, leftZero = false;

        // 1
        for (int c = 0; c < col; c++) topZero |= matrix[0][c] == 0;
        for (int r = 0; r < row; r++) leftZero |= matrix[r][0] == 0;

        // 2
        for (int r = 1; r < row; r++) {
            for (int c = 1; c < col; c++) {
                if (matrix[r][c] == 0)
                    matrix[r][0] = matrix[0][c] = 0;
            }
        }

        // 3 for each row
        for (int r = 1; r < row; r++) {
            if (matrix[r][0] == 0) {
                for (int c = 1; c < col; c++) {
                    matrix[r][c] = 0;
                }
            }
        }
        // 3 for each col
        for (int c = 1; c < col; c++) {
            if (matrix[0][c] == 0) {
                for (int r = 1; r < row; r++) {
                    matrix[r][c] = 0;
                }
            }
        }

        // 4
        if (topZero) {
            for (int c = 0; c < col; c++) {
                matrix[0][c] = 0;
            }
        }
        if (leftZero) {
            for (int r = 0; r < row; r++) {
                matrix[r][0] = 0;
            }
        }
    }
}
