package question_651;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q671_Second_Minimum_Node_In_a_Binary_Tree {
    public int findSecondMinimumValue(TreeNode root) {
        Queue<TreeNode> queue = new PriorityQueue<>((o1, o2) -> o2.val - o1.val);
        build(queue, root);
        if (queue.size() < 2) return -1;

        return queue.poll().val;
    }

    public void build(Queue<TreeNode> queue, TreeNode root) {
        if (root == null) return;
        queue.add(root);
        if (queue.size() > 2) queue.poll();
        build(queue, root.left);
        build(queue, root.right);
    }
}
