package question_551;

import java.util.HashMap;
import java.util.Map;

public class Q594_Longest_Harmonious_Subsequence {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums) {
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }
        
        int seqValue = 0;
        for(int k: map.keySet()){
            int pre = map.get(k-1) == null ? 0 : map.get(k-1);
            
            if(pre==0) continue;
            
            int total = map.get(k) + pre;
            seqValue = Math.max(seqValue, total);
        }
        
        return seqValue;
    }
}
