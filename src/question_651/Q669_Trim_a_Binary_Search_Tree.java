package question_651;

public class Q669_Trim_a_Binary_Search_Tree {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null) return null;
        if(root.val == L) root.left = null;
        if(root.val == R) root.right = null;

        if(root.val>R) {
            while(root!=null && root.val>R) root=root.left;
            return trimBST(root, L, R);
        } else if(root.val<L){
            while(root!=null && root.val<L) root=root.right;
            return trimBST(root, L, R);
        } else {
            root.left = trimBST(root.left, L, R);
            root.right = trimBST(root.right, L, R);
        }

        return root;
    }
}
