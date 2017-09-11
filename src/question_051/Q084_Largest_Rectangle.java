package question_051;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q084_Largest_Rectangle {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        int max = 0, len = heights.length;
        if (len == 0) return 0;
        if (len == 1) return heights[0];
        stack.addLast(heights[0]);

        for (int i = 1; i < len; i++) {
            int e = stack.getLast();
            if (heights[i] > e) {
                stack.addLast(heights[i]);
            } else {
                max = getCurMax(max, stack, heights[i]);
            }
        }
        max = getCurMax(max, stack, 0);
        return max;
    }

    public int getCurMax(int max, Deque<Integer> stack, int cur) {
        //calculate current area hold by removed bars
        int removed = 0;
        while (stack.size() > 0 && stack.getLast() > cur) {
            removed++;
            int e = stack.removeLast();
            max = Math.max(max, e * removed);
        }

        for (int i = 0; i < removed + 1; i++) {
            stack.addLast(cur);
        }

        return max;
    }
}
/*
Use a stack to track how many bars can hold at least current height

1. create a stack s
2. add new bar b,
    if b < last element in s, pop up and calculate how much area the removed bars can hold
    if b >= last element in s, add into s
3. return max area
To force the calculation for last bar, we add one extra bar with height 0

*/