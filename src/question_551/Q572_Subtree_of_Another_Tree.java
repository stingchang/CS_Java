package question_551;

public class Q572_Subtree_of_Another_Tree {
	public boolean isSubtree(TreeNode s, TreeNode t) {
		if (t == null)
			return true;
		if (s == null)
			return false;
		if (sameTree(s, t)) {
			return true;
		} else {
			return isSubtree(s.left, t) || isSubtree(s.right, t);
		}
	}

	public boolean sameTree(TreeNode s, TreeNode t) {
		if (s == null && t == null)
			return true;
		else if (s == null || t == null)
			return false;
		if (s.val != t.val)
			return false;
		return sameTree(s.left, t.left) && sameTree(s.right, t.right);
	}
}
