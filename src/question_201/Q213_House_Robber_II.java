package question_201;

import java.util.Arrays;

public class Q213_House_Robber_II {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        if (len == 1) return nums[0];
        if (len == 2) return Math.max(nums[0], nums[1]);

        int skipFirst = getProfit(Arrays.copyOfRange(nums, 0, len - 1));
        int skipLast = getProfit(Arrays.copyOfRange(nums, 1, len));
        return Math.max(skipFirst, skipLast);
    }

    public int getProfit(int[] nums) {
        int preNo = 0, preYes = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            int tmp = preNo;
            preNo = Math.max(preNo, preYes);
            preYes = nums[i] + tmp;
        }
        return Math.max(preNo, preYes);
    }
}
