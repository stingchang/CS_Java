package question_651;

public class Q661_Image_Smoother {
    public int[][] imageSmoother(int[][] M) {
        // step 1, calculate new color and store in 8~15 bits
        int row = M.length, col = M[0].length;
        for(int r = 0; r<row; r++){
            for(int c = 0; c<col; c++){
                int newColor = getColor(M, r, c);
                newColor<<=8;
                M[r][c]+=newColor;
            }
        }

        // step 2, remove old color
        for(int r = 0; r<row; r++){
            for(int c = 0; c<col; c++){
                M[r][c]>>=8;
            }
        }

        return M;
    }
    public int getColor(int[][] m, int row, int col) {
        int sum = 0;
        int mask = 255;
        int validElement = 0;
        for(int r = row-1; r<=row+1; r++){
            for(int c = col-1; c<=col+1; c++){
                if(r>=0 && c>=0 && r<=m.length-1 && c<=m[0].length-1 ){
                    sum += m[r][c] & mask;
                    validElement++;
                }

            }
        }
        return (sum/validElement ) & mask;
    }
}
