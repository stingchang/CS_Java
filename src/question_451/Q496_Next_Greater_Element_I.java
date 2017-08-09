package question_451;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Q496_Next_Greater_Element_I {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();
        
        // put 1st element into stack
        stack.addLast(nums[0]);
        for(int i=1; i< nums.length; i++) {
            while(!stack.isEmpty() && stack.peek()<nums[i]) {
                map.put(stack.removeFirst(), nums[i]);
            }
            stack.addFirst(nums[i]);
        }
        while(!stack.isEmpty()) {
        	map.put(stack.removeFirst(), -1);
        }
        
        for(int i =0; i< findNums.length; i++){
        	findNums[i] = map.get(findNums[i]); 
        }
        
        return findNums;
    }
}
