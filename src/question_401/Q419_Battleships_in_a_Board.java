package question_401;

public class Q419_Battleships_in_a_Board {
    public int countBattleships(char[][] board) {
    	
    	int row = board.length;
    	if(row ==0) return 0;
    	
    	int col = board.length;
    	if(col ==0) return 0;
    	
    	int count = 0;
    	
    	for(int r = 0; r<row; r++) {
    		for(int c = 0; c<col; c++) {
    			if(board[r][c] == 'X'){
    				count++;
    				board[r][c] = '.';
    				clearRight(r, c+1, board);
    				clearDown(r+1, c, board);
    			}
    		}
    	}
    	
    	
    	return count;
    }
    
    private void clearRight(int r, int c, char[][] board){
    	if(c<board[0].length-1 && board[r][c]=='X'){
    		board[r][c] = '.';
    		clearRight(r, c+1, board);
    	}
    }
    private void clearDown(int r, int c, char[][] board){
    	if(r<board.length-1 && board[r][c]=='X'){
    		board[r][c] = '.';
			clearDown(r+1, c, board);
    	}
    }
}
