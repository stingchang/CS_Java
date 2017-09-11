package question_051;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Q085_Maximal_Rectangle {
    public int maximalRectangle(char[][] matrix) {

        if (matrix.length == 0 || matrix[0].length == 0) return 0;
        int row = matrix.length;
        int col = matrix[0].length;

        for (int r = 0; r < row; r++) {
            System.out.println(Arrays.toString(matrix[r]));
        }
        System.out.println();

        // convert to 84 cases
        int[][] newMat = genTestCases(matrix, row, col);
        printMatrix(newMat);

        int max = 0;
        for (int i = 0; i < row; i++) {
            int[] arr = new int[newMat.length+1];
            System.arraycopy(newMat, 0, arr, 0, newMat.length);
            max = Math.max(getLargestRectangle(arr), max);
        }

        return max;
    }

    public int getLargestRectangle(int[] test) {

        // create a stack to hold ascending numbers
        // add new bar b,
        // if b >= last element, add b into stack
        // if b < last element, calculate area we have so far and fill back int b till no more element < b
        // add 0 to stack to force calculate again

        int len = test.length;
        if (len == 0) return 0;
        if (len == 1) return test[0];

        Deque<Integer> stack = new ArrayDeque<>();
        int area = 0;
        stack.addLast(test[0]);
        int max = stack.getLast();
        for (int i = 1; i < len; i++) {
            int last = stack.getLast();
            int b = test[i];
            if(b >= last){
                stack.addLast(b);
            } else {
                int removed = 0;
                System.out.print("add "+ b+ "=> stack = "+stack);
                while(!stack.isEmpty() && stack.getLast()>b){
                    removed++ ;
                    int l = stack.removeLast();
                    max = Math.max(max, l*removed);
                }
                System.out.print(", max = "+max+" removed stack "+stack);
                for(int addBack =0; addBack<=removed; addBack++){
                    stack.addLast(b);
                }
                System.out.println(", new Stack  = "+stack);
            }

        }
        System.out.println("max = "+max);
        return max;
    }

    public int[][] genTestCases(char[][] matrix, int row, int col) {
        int[][] newMat = new int[row][col];
        for (int c = 0; c < col; c++) {
            newMat[0][c] = matrix[0][c] == '0' ? 0 : 1;
        }

        for (int r = 1; r < row; r++) {
            for (int c = 0; c < col; c++) {
                newMat[r][c] = matrix[r][c] == '0' ? 0 : newMat[r - 1][c] + 1;
            }
        }
        return newMat;
    }

    public void printMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            System.out.println(Arrays.toString(matrix[r]));
        }
    }


    public static void main(String[] args) {
        char[][] test = {{'1', '1', '0', '1', '0', '1'},
                {'0', '1', '0', '0', '1', '1'},
                {'1', '1', '1', '1', '0', '1'},
                {'1', '1', '1', '1', '0', '1'}};

        char[][] t2 = {{'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}};

        Q085_Maximal_Rectangle q = new Q085_Maximal_Rectangle();
        int area = q.maximalRectangle(t2);
        System.out.println(area);
    }
}
