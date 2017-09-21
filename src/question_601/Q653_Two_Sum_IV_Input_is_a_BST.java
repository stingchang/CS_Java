package question_601;

import java.util.ArrayList;
import java.util.List;

public class Q653_Two_Sum_IV_Input_is_a_BST {
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        List<Integer> list = buildList(root);
        int a = 0, b = list.size() - 1;
        while (a < b) {
            int sum = list.get(a) + list.get(b);
            if (sum == k) return true;
            else if (sum < k) a++;
            else b--;
        }
        return false;
    }

    public List<Integer> buildList(TreeNode node) {
        if (node == null) return new ArrayList<Integer>();

        List<Integer> left = buildList(node.left);
        List<Integer> right = buildList(node.right);
        left.add(node.val);
        left.addAll(right);
        return left;
    }
}
