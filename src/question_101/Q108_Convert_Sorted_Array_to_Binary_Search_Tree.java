package question_101;

public class Q108_Convert_Sorted_Array_to_Binary_Search_Tree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length < 1) return null;
        return construct(nums, 0, nums.length-1);
    }
    
    public TreeNode construct(int[] nums, int a, int b){
        int mid = a+(b-a)/2;
        TreeNode n = new TreeNode(nums[mid]);
        if(mid>a){
            n.left = construct(nums, a, mid-1);
        } 
        if(b>mid){
            n.right = construct(nums, mid+1, b);
        }
        
        return n;
    }
}
