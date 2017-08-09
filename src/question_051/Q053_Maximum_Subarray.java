package question_051;

public class Q053_Maximum_Subarray {
	 public int maxSubArray(int[] nums) {
	        int i = 0, len = nums.length;
	        if(len == 0) return 0;
	        
	        int curMax = nums[0], totalMax = nums[0];
	        while(i < len && nums[i]< 0) {
	            curMax = Math.max(curMax, nums[i]);
	            i++;
	        }
	        
	        if(i==len) return curMax;
	        curMax = nums[i];
	        totalMax = nums[i];
	        // System.out.print("curMax = "+curMax+", i = "+i);
	        i++;
	        // System.out.println(", search from "+i);
	        while(i < len) {
	            curMax += nums[i];
	            if(curMax < 0) curMax = 0;
	            if(totalMax < curMax) totalMax = curMax;
	            // System.out.println("nums["+i+"] = "+nums[i]+", curMax = "+curMax+", totalMax = "+totalMax);
	            i++;
	        }
	        
	        return totalMax;
	    }
}
