package question_251;

public class Q292_Nim_Game {
	 public boolean canWinNim(int n) {
	        return n%4 > 0;
	    }
	/**
	 *   1 2 3 4 5 6 7 8 9 10
	 *   w w w l w w w l 
	 */    
	 public static void main(String args[]){
		 Q292_Nim_Game q = new Q292_Nim_Game();
		 System.out.println(q.canWinNim(4));
		 System.out.println(q.canWinNim(131));
	 }
}
