package question_051;

public class Q035_Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        // do binary search, if(i1 = i2) insert i1+1
        // if(arr[mid]<t) search (i1~mid-1)    , cover [3 5 5 5] => [3 5] => []
        // if(arr[mid]>=t) search (mid~i2)
        int len = nums.length;
        
        if(len == 0) 
            return 0;
            
        return binarySearch(nums, target, 0, len-1);
    }
    
    private int binarySearch(int[] num, int t, int i1, int i2){
        System.out.println(i1+", "+i2);
        if(i1 == i2) {
            return (num[i1]>=t) ? i1: i1+1;
        }
        int mid = i1+(i2-i1)/2;
        
        if(num[mid]>=t) return binarySearch(num, t, i1, mid);
        return binarySearch(num, t, mid+1, i2);
    }
}
