package question_151;

public class Q153_Find_Minimum_in_Rotated_Sorted_Array {
    public int findMin(int[] nums) {

        int i = 0, j = nums.length-1;
        if(nums[i]<=nums[j]) return nums[i];
        while(i<j){
            int mid = i+(j-i)/2;
            // System.out.println("mid"+mid+" i j = "+i+" "+j);
            if(nums[mid]<nums[j])
                j = mid;
            else
                i = mid+1;
        }
        return nums[i];
    }
}
// 3 cases
// a[i] < a[j] not sorted, min = a[0]
// a[i] < a[mid], pivot at right, i = mid+1
// a[mid] < a[j], pivot at i~mid, j = mid
