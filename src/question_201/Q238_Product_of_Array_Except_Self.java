package question_201;

import java.util.Arrays;

public class Q238_Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        Arrays.fill(result, 1);
        // left to right
        for (int i = 1; i < len; i++) result[i] = result[i - 1] * nums[i - 1];
        // right to left
        for (int i = len - 2; i >= 0; i--) {
            result[i] *= nums[i + 1];
            nums[i] *= nums[i + 1];
        }
        return result;
    }
}
/*
from left to right(1~len-1)
new arr, arr[i] is mutiplication of all elements from nums[0]~nums[i-1]
from right to left(len-2~0)
arr[i]*=arr[i+1]; nums[i+1] is mutiplication of nums[len-1]~nums[i+1]
*/