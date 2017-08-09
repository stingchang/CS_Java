package question_251;

public class Q283_Move_Zeroes {
    public void moveZeroes(int[] nums) {
        // 1. find first 0 at a
        // 2. find first non 0 at b after a
        // 3. swap nums[a], nums[b], a++, b++ 
        // 4. repeat 1~3 while b< nums.length
        // 5. fill all positions after a as 0
        
        int a = 0, b = 0, len = nums.length;
        while(a<len && nums[a]!=0) a++;
        b = a+1;
        while(b<len){
            while(b<len && nums[b]==0) b++;
            if(b<len && nums[b] !=0 ){
                nums[a] = nums[b];
                nums[b] = 0;
            }
            a++;
            b++;
        }
        // a++;
        // while(a<len){
        //     nums[a++] =0;
        // }
    }
}
