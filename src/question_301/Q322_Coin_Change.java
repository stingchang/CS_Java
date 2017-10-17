package question_301;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q322_Coin_Change {
    public int coinChange(int[] coins, int amount) {
        Queue<Integer> minQueue = new PriorityQueue<>();
        Arrays.sort(coins);
        findAllSolution(coins, coins.length, amount, 0, minQueue);
        return minQueue.peek();
    }

    public void findAllSolution(int[] coins, int index, int amount, int nums, Queue<Integer> minQueue) {
        if (amount - coins[index] == 0) {
            minQueue.offer(nums + 1);
            return;
        }
        if (amount - coins[index] < 0) {
            return;
        }
        findAllSolution(coins, index, amount - coins[index], nums + 1, minQueue);
        if(index>0)
            findAllSolution(coins, index-1, amount - coins[index], nums + 1, minQueue);
    }
}
