package question_101;

import java.util.ArrayList;
import java.util.List;

public class Q107_Binary_Tree_Level_Order_Traversal_II {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> lists = new ArrayList<>();

		if (root == null)
			return lists;

		List<TreeNode> l = new ArrayList<>();
		l.add(root);
		construct(lists, l);

		return lists;
	}

	public void construct(List<List<Integer>> lists, List<TreeNode> l1) {
		if (l1.isEmpty())
			return;

		List<TreeNode> l2 = new ArrayList<>();
		List<Integer> l1Values = new ArrayList<>();
		for (TreeNode n : l1) {
			l1Values.add(n.val);
			if (n.left != null)
				l2.add(n.left);
			if (n.right != null)
				l2.add(n.right);
		}

		lists.add(0, l1Values);
		construct(lists, l2);
	}
}
