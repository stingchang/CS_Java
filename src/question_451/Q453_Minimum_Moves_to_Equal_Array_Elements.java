package question_451;

public class Q453_Minimum_Moves_to_Equal_Array_Elements {
    public int minMoves(int[] nums) {
        // increment n-1 elements by 1 equals to decrement 1 element by 1
        if(nums.length == 0) return 0;
        
        int min = nums[0];
        int sum = 0;
        for(int i: nums){
            sum += i;
            min = Math.min(min, i);
        }
        
        return sum-min*nums.length;
    }
}
