package question_201;

import java.util.ArrayList;
import java.util.List;

public class Q257_Binary_Tree_Paths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<List<TreeNode>> lists = new ArrayList<>();
        if (root == null) return new ArrayList<>();
        buildLists(lists, new ArrayList<>(), root);

        List<String> strList = new ArrayList<>();
        for (List<TreeNode> list : lists) {
            strList.add(buildString(list));
        }
        return strList;
    }

    public String buildString(List<TreeNode> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).val);
            if (i < list.size() - 1) sb.append("->");
        }
        return sb.toString();
    }

    public void buildLists(List<List<TreeNode>> lists, List<TreeNode> list, TreeNode root) {

        list.add(root);
        List<TreeNode> l = new ArrayList<>(list);
        List<TreeNode> r = new ArrayList<>(list);

        if (root.left == null && root.right == null) {
            lists.add(list);
        } else if (root.left == null) {
            buildLists(lists, l, root.right);
        } else if (root.right == null) {
            buildLists(lists, r, root.left);
        } else {
            buildLists(lists, l, root.right);
            buildLists(lists, r, root.left);
        }
    }
}
