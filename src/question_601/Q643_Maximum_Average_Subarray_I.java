package question_601;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q643_Maximum_Average_Subarray_I {
    public double findMaxAverage(int[] nums, int k) {
        // use a queue
        Deque<Integer> queue = new ArrayDeque<>();
        double total = 0;
        double max = 0;
        for (int i = 0; i < k; i++) {
            queue.addLast(nums[i]);
            total += nums[i];
        }
        max = total;
        for (int i = k; i < nums.length; i++) {
            queue.addLast(nums[i]);
            total = total + nums[i] - queue.removeFirst();
            max = Math.max(max, total);
        }
        return max / k;
    }
}
