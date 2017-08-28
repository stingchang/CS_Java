package question_101;

public class Q112_Path_Sum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        sum -= root.val;
        if(isLeaf(root) && sum ==0 ){
            return true;
        }
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }

    public boolean isLeaf(TreeNode n) {
        return n.left == null && n.right ==null;
    }
}
