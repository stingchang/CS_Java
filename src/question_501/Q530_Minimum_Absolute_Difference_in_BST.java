package question_501;

public class Q530_Minimum_Absolute_Difference_in_BST {

    public int getMinimumDifference(TreeNode root) {
        int left = root.left == null ? Integer.MAX_VALUE : minDiff(root.left, root.val, root.val);
        int right = root.right == null ? Integer.MAX_VALUE : minDiff(root.right, root.val, root.val);
        return Math.min(left, right);
    }

    public int minDiff(TreeNode root, int min, int max) {
        int cur = Math.min(Math.abs(root.val - min), Math.abs(root.val - max));

        cur = root.left == null ? cur : Math.min(cur, minDiff(root.left, min, root.val));
        cur = root.right == null ? cur : Math.min(cur, minDiff(root.right, root.val, max));
        return cur;
    }
}
/*
compare each node with [min, max] pair,
recursively call compare(node.left,[min, node.val]) and compare(node.right,[node.val, max])
be carefull of root
*/