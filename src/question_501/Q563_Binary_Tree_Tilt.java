package question_501;

public class Q563_Binary_Tree_Tilt {
    int tilt = 0;

    public int findTilt(TreeNode root) {
        postOrder(root);
        return tilt;
    }

    public int postOrder(TreeNode node) {
        if (node == null) return 0;
        int left = postOrder(node.left);
        int right = postOrder(node.right);

        tilt += Math.abs(left - right);

        int sum = node.val + left + right;
        return sum;
    }
}