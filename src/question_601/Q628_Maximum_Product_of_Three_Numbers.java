package question_601;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q628_Maximum_Product_of_Three_Numbers {
    public int maximumProduct(int[] nums) {
        // store 2 min values
        Queue<Integer> minHeap = new PriorityQueue<>(2);
        // store 3 min values
        Queue<Integer> maxHeap = new PriorityQueue<>(3, Collections.reverseOrder());

        for(int i : nums){
            minHeap.add(i);
            maxHeap.add(i);
        }
        int max1 = maxHeap.poll();
        return max1 * Math.max(minHeap.poll()*minHeap.poll(), maxHeap.poll()*maxHeap.poll());
    }
}
