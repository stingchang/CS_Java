package question_101;

import java.util.ArrayList;

public class Q104_Maximum_Depth_of_Binary_Tree {
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;

		int max = 0;
		ArrayList<TreeNode> list = new ArrayList<>();
		ArrayList<TreeNode> next = new ArrayList<>();
		list.add(root);
		while (!list.isEmpty()) {
			for (TreeNode n : list) {
				if (n.left != null)
					next.add(n.left);
				if (n.right != null)
					next.add(n.right);
			}
			list.clear();
			list.addAll(next);
			next.clear();

			max++;
		}

		return max;
	}
}

//if(root==null){
//    return 0;
//}
//return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
