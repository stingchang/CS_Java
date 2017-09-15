package question_101;

public class Q116_Populating_Next_Right_Pointers_in_Each_Node {
    public void connect(TreeLinkNode root) {
        helper(root, null);
    }

    public void helper(TreeLinkNode cur, TreeLinkNode parent) {
        if (cur == null)
            return;

        // root
        if (parent == null) {
            cur.next = null;
        }
        // left child
        else if (cur == parent.left)
            cur.next = parent.right;
            // right child -> parent has next, connects parenet's next.left
        else if (parent.next != null) {
            cur.next = parent.next.left;
        }
        // right child -> parent doesn't have next, set next null
        else {
            cur.next = null;
        }
        helper(cur.left, cur);
        helper(cur.right, cur);
    }
}
