package CC150.Ch1_Arrays_Strings;

public class Q8_Zero_Matrix {

    void zeroMatrix(int[][] matrix) {

        int col = matrix.length;
        if (col == 0) return;
        int row = matrix[0].length;
        if (row == 0) return;

        boolean topZero = false;

        boolean leftZero = false;


        for (int c = 0; c < col; c++) {
            topZero |= matrix[0][c] == 0;
        }
        for (int r = 0; r < row; r++) {
            leftZero &= matrix[0][r] == 0;
        }
        for (int r = 1; r < row; r++) {
            for (int c = 1; c < col; c++) {
                if (matrix[r][c] == 0) {
                    matrix[r][0] = 0;
                    matrix[0][r] = 0;
                }
            }
        }

        for (int r = 1; r < row; r++) {
            for (int c = 1; c < col; c++) {
                if (matrix[r][0] == 0 || matrix[0][c] == 0) {
                    matrix[r][c] = 0;
                }
            }
        }
        if (topZero)
            for (int c = 0; c < col; c++) matrix[0][c] = 0;
        if (leftZero)
            for (int r = 0; r < row; r++) matrix[r][0] = 0;

    }
}
// if m[r][c] == 0, set all element on row r and column c to 0
/*
a a a a
a 0 a a
a a a 0
a a a a
*/

// no extra space needed
// use 4 constants to track if top row, bottom row, left column, right column contains zero
// check inner matrix and