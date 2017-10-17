package question_051;

import java.util.ArrayList;
import java.util.List;

public class Q054_Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return list;

        int top = 0, bottom = matrix.length - 1;
        int right = matrix[0].length - 1, left = 0;
        while (top <= bottom && right >= left) {
            System.out.println(top + " to " + bottom + " , " + left + " to " + right);
            // top
            for (int i = left; i <= right; i++) list.add(matrix[top][i]);
            top++;

            // right
            for (int i = top; i <= bottom; i++) list.add(matrix[i][right]);
            right--;

            //bottom
            if (top <= bottom) {
                for (int i = right; i >= left; i--) list.add(matrix[bottom][i]);
            }
            bottom--;

            // left
            if (right >= left) {
                for (int i = bottom; i >= top; i--) list.add(matrix[i][left]);
            }
            left++;
        }

        return list;
    }
}
