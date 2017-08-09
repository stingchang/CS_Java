package question_551;

import java.util.HashSet;
import java.util.Set;

public class Q575_Distribute_Candies {
	 public int distributeCandies(int[] candies) {
	        Set<Integer> set = new HashSet<>();
	        for(int c: candies){
	            set.add(c);
	        }
	        return Math.min(set.size(), candies.length/2);
	    }
}
