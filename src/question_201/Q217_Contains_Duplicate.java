package question_201;

import java.util.HashSet;
import java.util.Set;

public class Q217_Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length<=1) return false;
        Set<Integer> set = new HashSet<>();
        for(int n: nums) {
            if(set.contains(n)) return true;
            set.add(n);
        }
        return false;
    }
}
