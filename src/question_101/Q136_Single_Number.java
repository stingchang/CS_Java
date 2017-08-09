package question_101;

public class Q136_Single_Number {
    public int singleNumber(int[] nums) {
        int n=nums[0];
        for(int i =1; i< nums.length; i++){
            n ^= nums[i];
        }
        
        return n;
    }
    /**
     *  0011010
     *  1001001
     *  0011010
     * --------
     *  1001001
     */
}
