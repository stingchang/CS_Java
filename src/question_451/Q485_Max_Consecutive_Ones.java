package question_451;

public class Q485_Max_Consecutive_Ones {
	 public int findMaxConsecutiveOnes(int[] nums) {
	        int len = nums.length;
	        
	        int index = 0;
	        while(index<len && nums[index] == 0){
	            index++;
	        }
	        // No 1 found
	        if(index == len)
	            return 0;
	            
	        int maxOneOcc = 1;
	        int curOneOcc = 1;
	        index++;
	        while(index<len){
	            if(nums[index] == 1){
	                curOneOcc ++;
	            } else {
	                maxOneOcc = Math.max(maxOneOcc, curOneOcc);
	                curOneOcc = 0;
	            }
	            index++;
	        }
	            maxOneOcc = Math.max(maxOneOcc, curOneOcc);
	        return maxOneOcc;  
	    }
}
