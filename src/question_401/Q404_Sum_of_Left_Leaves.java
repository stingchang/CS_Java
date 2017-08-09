package question_401;

public class Q404_Sum_of_Left_Leaves {
    private int leafSum = 0;
    
    public int sumOfLeftLeaves(TreeNode root) {
        addLeaf(root, false);
        return leafSum;
    }
    
    private void addLeaf(TreeNode n, boolean isLeft){
        if(n == null) return;
        // add sum if n is left leaf
        if(n.left == null && n.right == null && isLeft) {
            leafSum += n.val;
        }
        addLeaf(n.left, true);
        addLeaf(n.right, false);
    }
}
