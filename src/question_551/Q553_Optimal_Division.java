package question_551;

public class Q553_Optimal_Division {
	  public String optimalDivision(int[] nums) {
	        int len = nums.length;
	        if(len == 0)
	            return "";
	        if(len == 1)
	            return String.valueOf(nums[0]);
	        if(len == 2)
	            return (nums[0]+"/"+nums[1]);
	        
	        StringBuilder sb = new StringBuilder();
	        sb.append(nums[0] + "/("+nums[1]);
	        for(int i =2; i<len; i++){
	            sb.append("/" + nums[i]);
	        }
	        sb.append(")");
	        
	        return sb.toString();
	    }
}
