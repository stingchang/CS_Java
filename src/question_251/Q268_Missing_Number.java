package question_251;

public class Q268_Missing_Number {
	 public int missingNumber(int[] nums) {
	        int len = nums.length;
	        if(len == 1) return nums[0] == 0 ? 1: 0;
	        
	        int expect = (len+1) * len / 2;
	        for(int i : nums) expect -= i;
	        return expect;
	    }
}
