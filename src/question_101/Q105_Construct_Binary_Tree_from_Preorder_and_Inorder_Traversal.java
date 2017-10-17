package question_101;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) return null;
        Deque<Integer> pre = new ArrayDeque<>();
        Deque<Integer> in = new ArrayDeque<>();
        for (int n : preorder) pre.addLast(n);
        for (int n : inorder) in.addLast(n);

        return helper(in, pre);
    }

    // in  2 1 3
    // pre 1 2 3
    public TreeNode helper(Deque<Integer> inorder, Deque<Integer> preorder) {
        if (inorder == null || preorder == null || inorder.size() == 0) return null;

        // head = n(1)
        TreeNode head = new TreeNode(preorder.removeFirst());

        // inLeft = (2), in = (1 3)
        Deque<Integer> inLeft = new ArrayDeque<>();
        while (inorder.getFirst() != head.val) inLeft.addLast(inorder.removeFirst());
        // in = (3)
        inorder.removeFirst();
        // inRight = (3)
        Deque<Integer> inRight = inorder;


        // pre 2 3
        Deque<Integer> preLeft = new ArrayDeque<>();
        while (preLeft.size() < inLeft.size()) preLeft.addLast(preorder.removeFirst());
        Deque<Integer> preRight = preorder;

        head.left = helper(inLeft, preLeft);
        head.right = helper(inRight, preRight);

        return head;
    }
}
