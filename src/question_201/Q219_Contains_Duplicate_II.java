package question_201;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class Q219_Contains_Duplicate_II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        /*
        use a set and a queue
        if new element can be fount in set, return false; otherwise poll from queue and offer new element
        */

        if (nums == null || nums.length <= 1) return false;
        Set<Integer> set = new HashSet<>();
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i : nums) {
            if (set.contains(i)) return true;
            set.add(i);
            queue.addLast(i);

            if (set.size() > k) {
                int lastNum = queue.removeFirst();
                set.remove(lastNum);
            }
        }
        return false;
    }
}
