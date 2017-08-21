package question_151;

public class Q189_Rotate_Array {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        while(k<0)
            k = k+len;
        while(k>len-1)
            k %= len;
        // reverse first half
        reverse(nums, 0, len-k-1);
        // reverse second hald
        reverse(nums, len-k,len-1);
        // reverse whole
        reverse(nums, 0, len-1);
    }
    public void reverse(int[] arr, int i, int j){
        while(i<j){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }
}
