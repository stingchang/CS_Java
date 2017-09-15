package question_101;

import java.util.Arrays;

public class Q123_Best_Time_to_Buy_and_Sell_Stock_III {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2)
            return 0;
        int[] profit_forward = new int[len];
        int[] profit_backward = new int[len];


        // profit_forward: from 0 to i, max profit at i if only 1 transaction
        int min = prices[0];
        for (int i = 1; i < len; i++) {
            min = Math.min(prices[i], min);
            profit_forward[i] = Math.max(profit_forward[i - 1], prices[i] - min);
        }

        // profit_backward: from len-1 to 0, max profit at i if only 1 transaction
        int max = prices[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            profit_backward[i] = Math.max(profit_backward[i + 1], max - prices[i]);
            max = Math.max(prices[i], max);
        //    System.out.println("i: "+i+" max:" +max+" ");

        }

        int profit = 0;
        for (int i = 0; i < len - 1; i++) {
            profit = Math.max(profit_forward[i] + profit_backward[i], profit);
        }
        //System.out.println("forward"+Arrays.toString(profit_forward));
       // System.out.println("backward"+Arrays.toString(profit_backward));

        return profit;
    }

    public static void main(String[] args) {
        Q123_Best_Time_to_Buy_and_Sell_Stock_III q = new Q123_Best_Time_to_Buy_and_Sell_Stock_III();
        int[] arr = {1, 2};
        int p = q.maxProfit(arr);
        System.out.println(p);
    }
}
/*
* use an array profit_forward to track from position 0 to i, max profit at i for 1 transaction
* use an array profit_backward to track from position n-1 to i, max profit at i for 1 transaction
*
* max profit of 2 transactions will be max profit_forward[i]+profit_backward[i+1]
*
* */