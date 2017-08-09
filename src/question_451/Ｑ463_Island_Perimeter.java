package question_451;

public class Ｑ463_Island_Perimeter {
	  public int islandPerimeter(int[][] grid) {
	        int row = grid.length;
	        if(row == 0)
	            return 0;
	        int col = grid.length;
	        if(col == 0)
	            return 0;

	        int pair = 0;
	        
	        for(int r = 0; r<grid.length; r++){
	            for(int c = 0; c<grid[0].length; c++){
	                if(grid[r][c] == 1 && (c==0 || grid[r][c-1]!=1)){
	                    pair++;
	                }
	            }
	        }    
	        for(int c = 0; c<grid[0].length; c++){
	            for(int r = 0; r<grid.length; r++){
	                if(grid[r][c] == 1 && (r==0 || grid[r-1][c]!=1)){
	                    pair++;
	                }
	            }
	        }    
	        
	        return 2*pair;
	    }
	    
	    
	    // for each row, check how many start/end pair
	    // for each col, check how many start/end pair
	    // return pairs * 2
}
