package question_101;

import java.util.ArrayList;
import java.util.List;

public class Q102_Binary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if(root==null) {
            // lists.add(new ArrayList<Integer>());
            return lists;
        }
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        while(list.size()>0){
            List<TreeNode> next = new ArrayList<>();
            List<Integer> values = new ArrayList<>();
            for(TreeNode n: list){
                values.add(n.val);
                if(n.left!=null) next.add(n.left);
                if(n.right!=null) next.add(n.right);
            }
            lists.add(values);
            list=next;
        }
        return lists;
    }
}
