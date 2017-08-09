package question_501;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q513_Find_Bottom_Left_Tree_Value {
	public int findBottomLeftValue(TreeNode root) {
		Deque<TreeNode> q1 = new ArrayDeque<>();
		Deque<TreeNode> q2 = new ArrayDeque<>();
		q1.addFirst(root);
		while (!q1.isEmpty()) {
			q2.clear();
			Deque<TreeNode> q3 = new ArrayDeque<>();
			while (!q1.isEmpty()) {
				TreeNode t = q1.removeFirst();
				if (t.left != null) {
					q3.addLast(t.left);
				}
				if (t.right != null) {
					q3.addLast(t.right);
				}
				q2.addLast(t);
			}
			q1.addAll(q3);
			q3.clear();
		}
		return q2.removeFirst().val;
	}
}


