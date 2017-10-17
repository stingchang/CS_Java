package question_251;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q297_Serialize_and_Deserialize_Binary_Tree {
    private static String delimiter = ",";
    private static String end = "#";
    private StringBuilder sb = new StringBuilder();
    ;


    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        helper(root);
        return sb.toString();
    }

    private void helper(TreeNode root) {
        if (root == null) sb.append(end).append(delimiter);
        else {
            sb.append(root.val).append(delimiter);
            serialize(root.left);
            serialize(root.right);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> deque = new ArrayDeque<>();
        String[] tokens = data.split(delimiter);
        for (String t : tokens) {
            deque.addLast(t);
        }
        return buildTree(deque);
    }

    private TreeNode buildTree(Deque<String> deque) {
        String cur = deque.removeFirst();
        if (cur.equals(end)) return null;

        TreeNode n = new TreeNode(Integer.parseInt(cur));
        n.left = buildTree(deque);
        n.right = buildTree(deque);
        return n;
    }
}
