package question_551;

public class Q543_Diameter_of_Binary_Tree {
	   public int diameterOfBinaryTree(TreeNode root) {
	        if(root == null) return 0;
	        
	        int depL = depth(root.left);
	        int depR = depth(root.right);
	        int path = 0;
	        if(depL!=0) path+=depL;
	        if(depR!=0) path+=depR;
	        
	        int pLeft = diameterOfBinaryTree(root.left);
	        int pRight = diameterOfBinaryTree(root.right);
	        // System.out.println(root.val+" path = "+path+", l = "+pLeft+", r = "+pRight);
	        return Math.max(path, Math.max(pLeft, pRight));
	    }
	    private int depth(TreeNode root) {
	        if(root == null) return 0;
	        return 1+Math.max(depth(root.left), depth(root.right));
	    }
}
