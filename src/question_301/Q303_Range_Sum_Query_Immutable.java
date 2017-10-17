package question_301;

public class Q303_Range_Sum_Query_Immutable {
    int[] arr;

    public Q303_Range_Sum_Query_Immutable(int[] nums) {
        arr = nums;
        for (int i = 1; i < nums.length; i++) arr[i] += arr[i - 1];
        
    }

    public int sumRange(int i, int j) {
        return i == 0 ? arr[j] : arr[j] - arr[i - 1];
    }
}
