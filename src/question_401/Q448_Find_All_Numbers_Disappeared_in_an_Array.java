package question_401;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q448_Find_All_Numbers_Disappeared_in_an_Array {
	   public List<Integer> findDisappearedNumbers(int[] nums) {
	        int len = nums.length;
	        Arrays.sort(nums);
	        List<Integer> list = new ArrayList<>();
	        if(len == 0) return list;
	        
	        int cur = 1;
	        while(cur != nums[0]){
	            list.add(new Integer(cur++));
	        }
	        int i = 0;
	        while(i<len-1){
	            // i i+k
	            if(nums[i+1] - nums[i]>1){
	                add(list, nums[i], nums[i+1]);
	            } 
	            i++;    
	        }
	        add(list, nums[len-1], len+1);
	        return list;
	    }
	    
	    public void add(List<Integer> list, int s, int e){
	        s++;
	        while(s<e){
	            list.add(new Integer(s++));
	        }
	    }
}
