package question_501;

import java.util.ArrayList;
import java.util.List;

public class Q538_Convert_BST_to_Greater_Tree {
    public TreeNode convertBST(TreeNode root) {
        // 1. recursin for root to right children
        List<TreeNode> list  = inOrder(root);

        for(int i =list.size()-2; i>=0; i--){
            list.get(i).val += list.get(i+1).val;
        }

        return root;
    }
    public List<TreeNode> inOrder(TreeNode node) {
        if(node == null) return new ArrayList<TreeNode>();

        List<TreeNode> list = inOrder(node.left);
        list.add(node);
        list.addAll(inOrder(node.right));
        return list;
    }

}
