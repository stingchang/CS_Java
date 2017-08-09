package question_201;

public class Q226_Invert_Binary_Tree {
	public TreeNode invertTree(TreeNode root) {
		invertTreeNodes(root);

		return root;
	}

	public void invertTreeNodes(TreeNode root) {
		if (root == null)
			return;

		TreeNode tmp = root.right;
		root.right = root.left;
		root.left = tmp;

		invertTreeNodes(root.right);
		invertTreeNodes(root.left);
	}
}
