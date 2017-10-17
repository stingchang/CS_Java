package question_051;

public class Q063_Unique_Path_II {
    public int uniquePaths(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        if(row==0) return 0;
        int col = obstacleGrid[0].length;
        if(col==0) return 0;

        if(obstacleGrid[row-1][col-1]==1) return 0;

        for(int r = 0; r<row; r++){
            for(int c = 0; c<col; c++){
                if(obstacleGrid[r][c] == 1) obstacleGrid[r][c] = -1;
            }
        }



        if(obstacleGrid[0][0]!=-1) obstacleGrid[0][0] = 1;

        for(int r = 1; r<row; r++){
            if(obstacleGrid[r][0] == -1 || obstacleGrid[r-1][0] ==-1)
                obstacleGrid[r][0] =  -1;
            else
                obstacleGrid[r][0] =  1;
        }

        for(int c = 1; c<col; c++){
            if(obstacleGrid[0][c] == -1 || obstacleGrid[0][c-1] ==-1)
                obstacleGrid[0][c] =  -1;
            else
                obstacleGrid[0][c] =  1;
        }


        for(int r = 1; r<row; r++){
            for(int c = 1; c<col; c++){
                if(obstacleGrid[r][c] != -1) {
                    int u = obstacleGrid[r-1][c] == -1 ? 0 : obstacleGrid[r-1][c];
                    int l = obstacleGrid[r][c-1] == -1 ? 0 : obstacleGrid[r][c-1];
                    obstacleGrid[r][c] = l+u;
                }
            }
        }
        for(int r = 0; r<row; r++){
            for(int c = 0; c<col; c++){
                System.out.print(obstacleGrid[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println();

        return obstacleGrid[row-1][col-1] == -1 ? 0 : obstacleGrid[row-1][col-1];
    }

    public static void main(String[] args) {
        Q063_Unique_Path_II q = new Q063_Unique_Path_II();
        int arr[][] = {
                {0,0}
        };
        int ans = q.uniquePaths(arr);
    }
}
