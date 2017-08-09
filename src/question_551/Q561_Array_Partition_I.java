package question_551;

import java.util.Arrays;

public class Q561_Array_Partition_I {
    public int arrayPairSum(int[] nums) {
        int len = nums.length;
        if(len == 0)
            return 0;
            
        Arrays.sort(nums);
        
        for(int i = 2; i< len; i+=2){
            nums[0] += nums[i];
        }
        
        return nums[0];
    }
}
