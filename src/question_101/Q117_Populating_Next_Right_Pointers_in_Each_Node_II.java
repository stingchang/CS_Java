package question_101;

public class Q117_Populating_Next_Right_Pointers_in_Each_Node_II {
    public void connect(TreeLinkNode root) {
        if(root == null)
            return;
        root.next = null;
        if(root.left == null && root.right ==null)
            return;
        if(root.left != null)
            helper(root, root.left);
        else
            helper(root, root.right);
    }

    public void helper(TreeLinkNode parent, TreeLinkNode child) {
        if(child == null)
            return;
        // System.out.println("parent : "+parent.val+" child : "+child.val);
        TreeLinkNode cur = child;

        while(parent!=null){
            if(cur == parent.left){
                if(parent.right!=null){
                    cur.next = parent.right;
                    cur = cur.next;
                }
                parent = parent.next;
            } else if(cur == parent.right){
                parent = parent.next;
            } else if(parent.left!=null) {
                cur.next = parent.left;
                cur = cur.next;
            } else if(parent.right!=null) {
                cur.next = parent.right;
                cur = cur.next;
            } else {
                parent = parent.next;
            }
        }
        while(child!=null && child.left == null && child.right == null)
            child = child.next;

        if(child == null){
            return;
        }
        if(child.left == null)
            helper(child, child.right);
        else
            helper(child, child.left);
    }
}
