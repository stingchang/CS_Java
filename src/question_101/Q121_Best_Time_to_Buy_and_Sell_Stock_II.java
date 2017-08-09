package question_101;

public class Q121_Best_Time_to_Buy_and_Sell_Stock_II {
	  public int maxProfit(int[] prices) {
	        // if(prices == null) 
	        //     return 0;
	        
	        // int len = prices.length;
	        // if(len <= 1) 
	        //     return 0;
	            
	        // int i = 0, j = 0, sum = 0;
	        // while( i < len && j < len) {
	        //     // find lowest
	        //     while( i< len-1 && prices[i]>=prices[i+1]){
	        //         i++;
	        //     } 
	            
	        //     if( i< len-1) {
	                
	        //         // find peak after i
	        //         j = i+1;
	        //         while(j < len-1 && prices[j+1]>=prices[j]) {
	        //             j++;
	        //         }
	        //         System.out.print("Buy at "+prices[i]);
	        //         System.out.println(", Sell at "+prices[j]);
	        //         sum += prices[j] - prices[i];
	        //         i = j+1;
	        //     } else {
	        //         // add i to break loop
	        //         i++;
	        //     }
	        // }
	        
	/**
	 * 1. Find 1st stock i which has next and next price is higher
	 * 2. Find peak point j after i which has no next or next is lower
	 * 3. Add arr[j] - arr[i] to sum. 
	 * Repeat 1~3 after each j
	 */
	        int sum = 0;
	        for(int i =0; i< prices.length-1; i++){
	            int diff = prices[i+1]-prices[i];
	            sum += diff >0 ? diff : 0; 
	        }
	        
	        
	        return sum;
	    }
}
