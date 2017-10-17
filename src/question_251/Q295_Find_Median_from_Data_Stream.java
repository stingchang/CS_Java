package question_251;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q295_Find_Median_from_Data_Stream {
    private Queue<Double> largers;
    private Queue<Double> smallers;

    /** initialize your data structure here. */
    public Q295_Find_Median_from_Data_Stream() {
        largers = new PriorityQueue<>();
        smallers = new PriorityQueue<>(10, Collections.reverseOrder());
    }

    public void addNum(int num) {
        if(largers.size()==0 || num>=largers.peek()) largers.offer((double)num);
        else smallers.offer((double)num);

        // balance
        while(largers.size()-smallers.size()>=2) smallers.offer(largers.poll());
        while(smallers.size()-largers.size()>=1) largers.offer(smallers.poll());
    }

    public double findMedian() {
        if(largers.size()==smallers.size()) return (largers.peek()+smallers.peek())/2;
        return largers.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */

/*
keep a minHeap for larger half and a maxHeap for smaller half, minHeap size<= maxHeap size
1 2 3 4
   2   3
  /    \
  1     4
get medium: if(minHeap size==maxHeap size) return avg(heap top); or return minHeap top

add num: if(num>min Heap top) add num to minHeap; otherwise add to maxHeap
balance->
make minheap size-maxHeap size <=1

*/