package question_101;

public class Q121_Best_Time_to_Buy_and_Sell_Stock {
	public int maxProfit(int[] prices) {
        // int len = prices.length;
        // if(len<=1) return 0;
        
        // int max = 0;
        // int[] lowestFromHead = new int[len];
        // int[] highestFromTail = new int[len];
        
        // lowestFromHead[0] = prices[0];
        // highestFromTail[len-1] = prices[len-1];
        // for(int i =1; i< len; i++) {
        //     lowestFromHead[i] = Math.min(prices[i], lowestFromHead[i-1]);
        //     highestFromTail[len-1-i] = Math.max(prices[len-1-i], highestFromTail[len-i]);
        // }
        
        // for(int i =0; i< len-1; i++) {
        //   max = Math.max(max, highestFromTail[i+1] - lowestFromHead[i]);
        // }

        // find cur min, cur max, cur profit
        int len = prices.length;
        if(len<2) return 0;
        int min = prices[0];
        int p = 0;
        for(int i =1; i<len; i++){
            min = Math.min(min, prices[i]);
            p = Math.max(p, prices[i] - min);
        }
        
        return p;
    }
}

/*
1. create 2 arrays
   a. from head: lowest price from start to now
   b. from tail: highest price from end to now
2. max profit exist at arr2[i+1] - arr1[i]
[7,1,5,3,6,4]
7 1 1 1 1 1
7 6 6 6 6 4
*/
