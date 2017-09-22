package question_051;

import java.util.ArrayList;
import java.util.List;

public class Q094_Binary_Tree_Inorder_Traversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> in = new ArrayList<>();
        inorder(root, in);
        return in;
    }
    public void inorder(TreeNode root, List<Integer> list){
        if(root==null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
