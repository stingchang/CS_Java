package question_251;

import java.util.Arrays;

public class Q300_Longest_Increasing_Subsequence {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        int[] arr = new int[len];
        Arrays.fill(arr, 0);
        arr[0] = 1;

        int max = 1;
        for (int i = 1; i < len; i++) {
            arr[i] = 1;
            max = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    // System.out.print(" "+j+" "+arr[j]+" .");
                    max = Math.max(arr[j], max);
                }
            }
            arr[i] = max + 1;
            // System.out.println();
        }
        max = 1;
        for (int i = 0; i < len; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println(Arrays.toString(arr));

        return max;
    }
}
