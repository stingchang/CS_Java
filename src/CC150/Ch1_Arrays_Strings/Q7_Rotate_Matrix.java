package CC150.Ch1_Arrays_Strings;

public class Q7_Rotate_Matrix {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            rotateRight(matrix, i);
        }
    }

    private void rotateRight(int[][] matrix, int layer) {
        // r = 0+layer to len-1-layer
        // c = 0+layer to len-1-layer


        int len = matrix.length;
        int start = layer;
        int end = len - 1 - layer;
        for (int index = start; index<=end; index++) {
            int tmp=matrix[len-1-layer-index][len-1-layer];
            // top to right

            matrix[len-1-layer-index][len-1-layer] = matrix[layer+index][len-1-layer-index];
            // left to top
            matrix[layer+index][len-1-layer-index] = matrix[layer][index];


            // bottom to left
            matrix[layer][index] = matrix[index][layer-1-layer];
            // right to bottom
            matrix[index][layer-1-layer] = matrix[layer-1-index][len-layer];


        }
    }
}
// rotate n x n matrix 90 degree
/*
  0 1 2
 2      0
 1      1
 0      2
  2 1 0
*/